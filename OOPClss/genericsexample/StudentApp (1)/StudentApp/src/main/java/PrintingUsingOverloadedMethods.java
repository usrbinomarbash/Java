
package genericsexample;

import java.aui.students.studentapp.Student;
import java.aui.students.studentapp.Address;


public class PrintingUsingOverloadedMethods {


    public static <T> StringBuilder printArray(T[] array){
        StringBuilder result = new StringBuilder();
        for(T element: array){
           result.append(element).append(" ");
        }
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
      Student [] studentArray = { new Student("Alice",3.5,40), new Student("Bob",3.5,85)};
      printArray(studentArray);
    }
}
