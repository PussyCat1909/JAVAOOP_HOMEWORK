package BT_OOP3.common;

import BT_OOP2.company.Company;

public class Basetest {
    public void createDriver(){
        System.out.println("Browser :"+ Constants.Browser);
        System.out.println("Report :"+ Constants.report);
        System.out.println("Headless :"+ Constants.headless);

    }
    public void createDriver(String browser){
        System.out.println("Browser :"+ browser);
        System.out.println("Report :"+ Constants.report);
        System.out.println("Headless :"+ Constants.headless);

    }
    public  void closeDriver(){
        System.out.println("Close Browser :"+ Constants.Browser);
    }
    public  void closeDriver(String Browser){
        System.out.println("Close Browser :"+ Browser);
    }
}
