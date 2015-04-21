package school;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Zornitsa Petkova on 4/21/15.
 */
public class SchoolTest {
  School student;

  @Before
  public void setUp() {
    student = new School();
  }

  @Test
  public void sortOfSpeciality() {
    Student ivan = new Student("Ivan", 18000, "Informatika", 5.20);
    Student kaloqn = new Student("Kaloqn", 18010, "Informatika", 5.90);
    Student zornica = new Student("Zornica", 18007, "Matematika", 5.95);
    student.add(ivan);
    student.add(kaloqn);
    student.add(zornica);
    assertThat(student.sortMarks("Informatika"), is("18010,5.9 18000,5.2 "));
  }
  @Test
  public void sortAllStudents() {
    Student ivan = new Student("Ivan", 18000, "Informatika", 5.20);
    Student kaloqn = new Student("Kaloqn", 18010, "Informatika", 5.90);
    Student zornica = new Student("Zornica", 18007, "Matematika", 5.95);
    student.add(ivan);
    student.add(kaloqn);
    student.add(zornica);
    student.remove(1);
    student.sortNumber();
    final StringBuilder buffer = new StringBuilder();
    student.print(new Display(){

      @Override
      public void print(Student value) {
        buffer.append(value.getNumber()).append(" ");
      }
    });
    assertThat(buffer.toString(), is("18000 18007 "));
  }
  @Test(expected = IndexOutOfBoundsException.class)
  public void removeOfEmptyList(){
    student.remove(0);
  }
}
