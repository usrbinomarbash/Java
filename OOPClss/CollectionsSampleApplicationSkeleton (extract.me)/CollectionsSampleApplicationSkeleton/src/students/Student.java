
package students;

public class Student {

    private String name;
    private double gpa;
    private int id;

    public Student(String name, double gpa, int id){
        this.gpa=gpa;
        this.name=name;
        this.id = id;
    }



    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setGpa(double gpa){
        this.gpa=gpa;
    }

    public double getGPA(){
        return gpa;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getID(){
        return id;
    }

    @Override
    public String toString(){
        return("The student: "+this.name+"has an id of: "+this.id+" and has a gpa of: "+this.gpa);
    }

    @Override
    public boolean equals(String name, double gpa){
        if((this.name == name)&&(this.gpa==gpa)){
            return true;
        }
        return false;
    }
}
