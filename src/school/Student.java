package school;

/**
 * Created by Zornitsa Petkova on 4/21/15.
 */
public class Student {
  private String name;
  private int number;
  private String speciality;
  private double mark;

  public Student(String name, int number, String speciality, double mark) {
    this.name = name;
    this.number = number;
    this.speciality = speciality;
    this.mark = mark;
  }

  public double getMark() {
    return mark;
  }

  public String getSpeciality() {
    return speciality;
  }

  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }
}
