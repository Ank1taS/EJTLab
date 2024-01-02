package com.example.assignment8.beans;
import java.io.Serializable;
public class Employee  implements Serializable{
    private String name;
    private String id;
    private String contact;
    private String department;

    public Employee(){}

    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getContact() {
        return contact;
    }
    public String getDepartment() {
        return department;
    }
}
