package com.example.demo.entity;

import javax.persistence.*;

@Table(name = "student")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int rollNo;
    private String name;
    private String address;
    private int number;

    public Student(int id, int rollNo, String name, String address, int number) {
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}
