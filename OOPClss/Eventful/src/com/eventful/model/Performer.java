package com.eventful.model.Performer;

public class Performer {
    private String name;
    private char gender;
    private int num_performances;
    private int age;
    private List<String> performances;

    public Performer(String name, char gender, int num_performances, int age, List<String> performances){
        this.name=name;
        this.gender=gender;
        this.num_performances=num_performances;
        this.age=age;
        this.performances=performances;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender=gender
    }

    public int getNum_performances(){
        return num_performances;
    }

    public void setPerformances(List<String> performances){
        this.performance=performances;
    }


    @Override
    public String toString(){
        return("Performer{name=%s, gender=%c, age=%d, performances=%d", name,gender,age,performances);
    }
}