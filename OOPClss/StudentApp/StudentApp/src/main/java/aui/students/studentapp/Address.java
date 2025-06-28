/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.students.studentapp;


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
    
    


    public int getStreet_num() {
        return street_num;
    }


    public void setStreet_num(int street_num) {
        this.street_num = street_num;
    }


    public String getStreet_name()
    {
        return street_name;
    }


    public void setStreet_name(String street_name)
    {
        this.street_name = street_name;
    }


    public String getCity()
    {
        return city;
    }


    public void setCity(String city)
    {
        this.city = city;
    }


    public String getCountry()
    {
        return country;
    }


    public void setCountry(String country)
    {
        this.country = country;
    }


    public int getZip_code()
    {
        return zip_code;
    }


    public void setZip_code(int zip_code)
    {
        this.zip_code = zip_code;
    }

    @Override
    public String toString()
    {
        return " "+street_num+", "+street_name+" "+city+" "+country+" "+zip_code;
    }
    
    
}
