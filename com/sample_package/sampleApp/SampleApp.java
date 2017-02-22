package com.sample_package.sampleApp:

public class SampleApp {
    
    public static void main (String[] args) {

        User ken = new User("ken");
        System.out.println(ken.name);
        ken.sayHi();

        AdminUser ken1 = new AdminUser("ken1");
        System.out.println(ken1.name);
        ken1.classUserSayHi();
        ken1.adminUserSayHello();
    
    }
}