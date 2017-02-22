package com.sample_package.sampleApp.model;

class User {
    String name;
    
    User(String name) {
        this.name = name;
    }
    
    void classUserSayHi() {
        System.out.println("Hi! " + this.name);
    }
}
