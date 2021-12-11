package com.springCore;

import java.util.Map;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private Address address;
    private Set<String> course;
    private Map<String,String> kvm;

    public Map<String, String> getKvm() {
        return kvm;
    }

    public void setKvm(Map<String, String> kvm) {
        this.kvm = kvm;
    }

    public Set<String> getCourse() {
        return course;
    }

    public void setCourse(Set<String> course) {
        this.course = course;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public void M1(){
        System.out.println("Calling Normal Method............");
    }
}
