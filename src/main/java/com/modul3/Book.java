package com.modul3;

public class Book {
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public boolean equals(Object o){
        Book e = (Book) o;
        return this.title.equals(e.title) &&
                this.author.equals(e.author);
    }

    public int hashCode(){
        return (title.hashCode() * 31) * (author.hashCode() * 7);
    }

    public String toString(){
        return "Title: \"" + title + "\", author: " + author;
    }

    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
}
