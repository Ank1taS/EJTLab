package com.example.assignment7.beans;

import java.io.PrintWriter;
import java.io.Serializable;
import java.security.PrivateKey;

public class Student implements Serializable{
    private String name;
    private String roll;
    private String gender;
    private String semester;

    //constructor
    public Student() {}

    // getters and setters
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll(String roll) {
        this.roll = roll;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public String getName() {
        return name;
    }
    public String getRoll() {
        return roll;
    }
    public String getGender() {
        return gender;
    }
    public String getSemester() {
        return  semester;
    }
}
