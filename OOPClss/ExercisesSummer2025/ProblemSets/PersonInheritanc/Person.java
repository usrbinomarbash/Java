import java.util.*;


public class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return String.format("Person{name='%s',age=%d}",name,age);
    }


    public static void main(String [] args){
        Person p = new Person("Alice Walton", 29);
        Student s = new Student("Bob", 20, 1001);
        Teacher t = new Teacher("Carol", 42, "Physics II", 55_000.00);
        List<Person> indivs = Arrays.asList(p,s,t);
        for(Person person: indivs){
            System.out.println(indivs);
        }
    }
}