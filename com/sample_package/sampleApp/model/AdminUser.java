package com.sample_package.sampleApp.model;

public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
    }
    
    public void adminUserSayHello() {
        System.out.println("Hello! " + this.name);
    }
    
    // override
    @Override
    public void classUserSayHi() {
        System.out.println("[admin] Hi! " + this.name);
    }
}