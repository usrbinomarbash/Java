/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aui.students.studentapp;

import java.util.Scanner;



public class StudentApp {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt for student 1 (without birthdate and address)
        System.out.println("Enter details for student 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();

        System.out.print("GPA: ");
        double gpa1 = scanner.nextDouble();

        System.out.print("Credits: ");
        int credits1 = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        Student stud1 = new Student(name1, gpa1, credits1);
        System.out.println(stud1); // Print student 1 info



        // Prompt for student 2 (with birthdate and address)
        System.out.println("\n Enter details for student 2:");

        System.out.print("Name: ");
        String name2 = scanner.nextLine(); //gets

        //for character next char

        System.out.print("GPA: ");
        double gpa2 = scanner.nextDouble();

        System.out.print("Credits: ");
        int credits2 = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        System.out.print("Birthdate (MM/dd/yyyy): ");
        String birthDate2 = scanner.nextLine();

        // Prompt for address
        System.out.println("\n Enter address details for student 2:");

        System.out.print("Street Number: ");
        int streetNumber = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        System.out.print("Street Name: ");
        String streetName = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Country: ");
        String country = scanner.nextLine();

        System.out.print("Postal Code: ");
        int postalCode = scanner.nextInt();
        
        // Create address object
        Address address = new Address(streetNumber, streetName, city, country, postalCode);

        // Create student 2 object
        Student stud2 = new Student(name2, gpa2, credits2, birthDate2, address);
        System.out.println(stud2); // Print student 2 info

        
        // Prompt for student 3 (with academic status)
        System.out.println("\n Enter details for student 3:");

        System.out.print("Name: ");
        scanner.nextLine(); // Clear the newline before the next input
        String name3 = scanner.nextLine();

        System.out.print("GPA: ");
        double gpa3 = scanner.nextDouble();

        System.out.print("Credits: ");
        int credits3 = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        // Prompt for academic status
        System.out.println("Academic Status (FRESHMAN, SOPHOMORE, JUNIOR, SENIOR): ");
        String status3 = scanner.nextLine().toUpperCase();

        // Create student 3 object
        Student stud3 = new Student(name3, gpa3, credits3, status3);
        System.out.println(stud3); // Print student 3 info
        
        // Close scanner
        scanner.close();
    
    }   
}
