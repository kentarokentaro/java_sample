package com.sample_package.sampleApp;
import com.sample_package.sampleApp.model.User;
import com.sample_package.sampleApp.model.AdminUser;
//import com.sample_package.sampleApp.model.cd*;

public class SampleApp {
    
    public static void main (String[] args) {

        User ken = new User("ken");
        //System.out.println(ken.name);
        ken.classUserSayHi();

        AdminUser ken1 = new AdminUser("ken1");
        //System.out.println(ken1.name);
        ken1.classUserSayHi();
        ken1.adminUserSayHello();
    
    }
}