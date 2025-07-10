/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.students.studentapp;

/**
 *
 * @author Oumaima Hourrane
 */
public class Address {
    private int street_num;
    private String street_name;
    private String city;
    private String country;
    private int zip_code;

    public Address(int street_num, String street_name, String city, String country, int zip_code) {
        this.street_num = street_num;
        this.street_name = street_name;
        this.city = city;
        this.country = country;
        this.zip_code = zip_code;
    }
    
    

    /**
     * @return the street_num
     */
    public int getStreet_num() {
        return street_num;
    }

    /**
     * @param street_num the street_num to set
     */
    public void setStreet_num(int street_num) {
        this.street_num = street_num;
    }

    /**
     * @return the street_name
     */
    public String getStreet_name() {
        return street_name;
    }

    /**
     * @param street_name the street_name to set
     */
    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the zip_code
     */
    public int getZip_code() {
        return zip_code;
    }

    /**
     * @param zip_code the zip_code to set
     */
    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return " "+street_num+", "+street_name+" "+city+" "+country+" "+zip_code; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
