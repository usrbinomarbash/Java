package com.library.librarian;

public class Librarian {
    private int employeeId;
    private String name;

    public Librarian(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return String.format(
                "Librarian[id=%d, name=%s]",
                employeeId, name
        );
    }



}
