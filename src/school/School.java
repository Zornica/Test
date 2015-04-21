package school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Zornitsa Petkova on 4/21/15.
 */
public class School {
  List<Student> list = new ArrayList<Student>();

  public void add(Student s) {
    list.add(s);
  }

  public String sortMarks(String speciality) {
    List<Student> marks = new ArrayList<Student>();
    for (Student each : list) {
      if (each.getSpeciality().equals(speciality)) {
        marks.add(each);
      }
    }

    Collections.sort(marks, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        if (o1.getMark() < o2.getMark()) {
          return 1;
        } else return -1;
      }
    });

    StringBuilder student = new StringBuilder();
    for (Student p : marks) {
      student.append(p.getNumber()).append(",").append(p.getMark()).append(" ");
    }

    return student.toString();
  }

  public void print(Display display) {
    for (Student each : list) {
      display.print(each);
    }
  }

  public void sortNumber() {

    Collections.sort(list, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        if (o1.getNumber() < o2.getNumber()) {
          return -1;
        } else {
          return 1;
        }
      }
    });
  }


  public void remove(int p) {
    list.remove(p);
  }

  public void removeByName(String name) {
    List<Student> names = new ArrayList<Student>();
    for (Student each : list) {
      names.add(each);
    }
    for (Student p : names) {
      if (p.getName().equals(name)) {
        list.remove(p);
      }
    }
  }
}
