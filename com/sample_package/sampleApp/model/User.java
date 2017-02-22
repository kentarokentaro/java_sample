package com.sample_package.sampleApp.model;

public class User {
    protected String name;
    
    public User(String name) {
        this.name = name;
    }
    
    public void classUserSayHi() {
        System.out.println("Hi! " + this.name);
    }
}
