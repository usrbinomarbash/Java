/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.students.studentapp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Oumaima Hourrane
 */


public class Student implements Printable{
    //Fields
    private String name;
    private double gpa;
    private int credits;
    private LocalDate date;
    private Address adds; //association (0..1)
    private AcademicStatus status; //association
    
    //constructors
    public Student(String name, double gpa, int credits ){
        this.name = name;
        this.credits = credits;
        this.gpa = gpa;
    }
 
    public Student(String name, double gpa, int credits, String date, Address adds) {
        this (name, gpa, credits);
        setDate(date);
        this.adds = adds;
    }

    public Student(String name, double gpa, int credits, String status) {
        this (name, gpa, credits);
        this.status = AcademicStatus.valueOf(status.toUpperCase());
    }


    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        this.date = LocalDate.parse(date, formatter);
    }

    @Override
    public String toString() {
        String str = "Student  "+name+", has credits: "+credits+", and gpa "+gpa;
        
        if (date != null) {
            str += ". Student's birthday is "+date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        }
        
        if (adds!=null){
            str += ". Student's address:"+adds.toString();
        }
        if (status != null) {
            str += ". Academic status: " + status.name();
        }
        

        return str; 
    }
}
