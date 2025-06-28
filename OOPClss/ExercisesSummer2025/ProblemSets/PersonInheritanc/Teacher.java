public class Teacher extends Person{
    private String subject;
    private double salary;

    public Teacher(String name, int age, String subject, double salary){
        super(name, age);
        this.subject=subject;
        this.salary=salary;
    }

    public String getSubject(){
        return subject;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return String.format("Teacher{%s, subject='%s',salary=%.2f}",super.toString(), subject,salary);
    }
}