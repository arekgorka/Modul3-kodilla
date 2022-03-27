package com.modul3;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

public class Modul3Application {

    public static void main(String[] args) {

        Book book = new Book("lala", "K.Sting");
        Book bookFirst = new Book("First King", "W.Bright");
        Book bookLast = new Book("Last King", "W.Bright");

        List<Book> bookList = new LinkedList<Book>();

        bookList.add(bookFirst);
        for(int i=0; i<300000; i++) {
            bookList.add(book);
        }
        bookList.add(bookLast);
        System.out.println(bookList.size());


        System.out.println("LinkedList:");

        long begin = System.nanoTime();
        bookList.get(0);
        bookList.remove(bookFirst);
        long end = System.nanoTime();
        System.out.println("Find and remove first element: " + (end - begin) + "ns");

        begin = System.nanoTime();
        bookList.get(bookList.size()-1);
        bookList.remove(bookLast);
        end = System.nanoTime();
        System.out.println("Find and remove last element: " + (end - begin) + "ns");

        begin = System.nanoTime();
        bookList.add(0, book);
        end = System.nanoTime();
        System.out.println("Add first element: " + (end - begin) + "ns");

        begin = System.nanoTime();
        bookList.add(bookList.size()-1, book);
        end = System.nanoTime();
        System.out.println("Add last element: " + (end - begin) + "ns");


        System.out.println();
        System.out.println("HashMap:");



        Random randomValue = new Random();

        Map<ReleaseDate, Book> mapBook = new HashMap<>();


        for(int i=0; i<300000; i++) {
            ReleaseDate releaseDate = new ReleaseDate(randomValue.nextInt(2000),
                    randomValue.nextInt(12), randomValue.nextInt(30));
            mapBook.put(releaseDate, book);
        }

        ReleaseDate releaseDate1 = new ReleaseDate(2000, 12, 30);

        begin = System.nanoTime();
        mapBook.put(releaseDate1, book);
        end = System.nanoTime();

        System.out.println("Add element: " + (end - begin) + "ns");

        begin = System.nanoTime();
        mapBook.get(releaseDate1);
        end = System.nanoTime();

        System.out.println("Find Key: " + (end - begin) + "ns");
        System.out.println(mapBook.get(releaseDate1));

        begin = System.nanoTime();
        mapBook.remove(releaseDate1, book);
        end = System.nanoTime();

        System.out.println("Remove element: " + (end - begin) + "ns");
    }

}
