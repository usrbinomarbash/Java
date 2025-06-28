package com.payroll.employee;

public class Employee{
    private String name;
    private int emp_id;
    private double salary;
    private String department;
    private int SSN;

    public Employee(String name, int emp_id, double salary, String department, int SSN){
        this.name=name;
        this.emp_id=emp_id;
        this.salary=salary;
        this.department=department;
        this.SSN=SSN;
    }

    @Override
    public String toString(){
        return(name+" is an employee with id: "+emp_id+" and has a salary of "+salary+" and works in the "+department+" department and has a SSN: "+SSN+".");
    }

}