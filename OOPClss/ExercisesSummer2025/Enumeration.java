import java.util.*;



public class Enumeration{
    public static void main(String [] args){
        System.out.println("What is your favorite day of the week?");
        Scanner sc=new Scanner(System.in);
        String dayst = sc.nextLine();
        daysOfWeek day =  daysOfWeek.valueOf(dayst);

    }
}