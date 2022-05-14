package com.example.neoflexapplibrary;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int isn;
    private String author;
    private String book_name;
    private int taken_by;

    public Books() {

    }




    public int getIsn() {
        return isn;
    }

    public String getAuthor() {
        return author;
    }

    public String getBook_name() {
        return book_name;
    }

    public int getTaken_by() {
        return taken_by;
    }

    public void setIsn(int isn) {
        this.isn = isn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setTaken_by(int taken_by) {
        this.taken_by = taken_by;
    }
}
