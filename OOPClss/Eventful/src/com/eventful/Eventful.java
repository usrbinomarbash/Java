package com.eventful;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;



public class Eventful {
    private String title;
    private Category category;
    private GregorianCalendar time;
    private Performer performer;

    public Eventful(String title, Category category, GregorianCalendar time, Performer performer){
        this.title=title;
        this.category=category;
        this.time=time;
        this.performer=performer;
    }

    public Event(String title, Category category, Performer performer){
        this(title,category, new GregorianCalendar(),performer);
    }

    public getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title=title;
    }


    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category=category;
    }


    public GregorianCalendar getTime() {
        return time;
    }

    public void setTime(GregorianCalendar time){
        this.time=time;
    }

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer){
        this.performer=performer;
    }

    @Override
    public String toString(){
        SimpleDateFormat fmt= new SimpleDateFormat("dd/mm/yyyy");
        String dateStr = fmt.format(time.getTime());

        return String.format("Event[title=%s, category=%s, date=%s, performance=%s]",title,categoryy,date,performance);

    }
}