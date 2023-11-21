package com.example.loginPage;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int bookWritten;
    private String country;
    private int age;

    public Author() {
    }

    public Author(int id, String name, int bookWritten, String country, int age) {
        this.id = id;
        this.name = name;
        this.bookWritten = bookWritten;
        this.country = country;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookWritten() {
        return bookWritten;
    }

    public void setBookWritten(int bookWritten) {
        this.bookWritten = bookWritten;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
