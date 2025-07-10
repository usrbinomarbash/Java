
package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class StudentCollection {

    List<Student> students;

    public StudentCollection(List<Student> students) {
        students s1= new ArrayList<>();
    }

    public boolean addstudent(Student stud) {
       students.add(stud);
    }

    public boolean removeStudent(Student stud){
        students.remove(stud);
    }

    public boolean searchStudent(Student stud){

    }

    public void modifyStudent(Student search, Student newStud) {

    }

    public Student getStudentWithName(String name) {
        return null;
    }

    public void modifyStudent(String name, Student newStud) {

    }

    public ArrayList<Student> findStudentsWithGpa(double gpa){
        return null;

    }

    public void sortStudents(Comparator comp) {

    }

    public ListIterator getStudents() {
        return null;
    }

    @Override
    public String toString(){
        return null;

    }
}
