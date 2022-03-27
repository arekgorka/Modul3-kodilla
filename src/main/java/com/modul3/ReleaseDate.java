package com.modul3;

public class ReleaseDate {
    Integer year;
    Integer month;
    Integer day;

    public ReleaseDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public boolean equals(Object o) {
        ReleaseDate e = (ReleaseDate) o;
        return this.year.equals(e.year) &&
                this.month.equals(e.month) &&
                this.day.equals(e.day);
    }

    public int hashCode(){
        return (year.hashCode() * 31) + (month.hashCode() * 7) + (day.hashCode() * 31);
    }

    public String toString(){
        return "Year: \"" + year + "\", month: " + month + "\", day: " + day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }
}
