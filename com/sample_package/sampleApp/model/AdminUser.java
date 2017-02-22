package com.sample_package.sampleApp.model;

class AdminUser extends User {
    AdminUser(String name) {
        super(name);
    }
    
    void adminUserSayHello() {
        System.out.println("Hello! " + this.name);
    }
    
    // override
    @Override
    void classUserSayHi() {
        System.out.println("[admin] Hi! " + this.name);
    }
}