package BT_OOP3.testcase;

import BT_OOP3.common.Basetest;

public class TestCases extends Basetest {
    public void StepsConfig(){
        System.out.println("Đi tới trang url https:\\abc.com");
        System.out.println("Nhập username");
        System.out.println("Nhập password");
        System.out.println("Click Login");
    }
    public void Login(){
        createDriver("Edge");
        StepsConfig();
        closeDriver();
    }
    public void AddCategory(){
        createDriver();
        StepsConfig();
        System.out.println("Chọn Category");
        System.out.println("Click addnew");
        System.out.println("Nhập thông tin category");
        System.out.println("Click save");
        System.out.println("Truy vấn, tìm kiếm lại category đã tạo");
        closeDriver("Chrome");
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.Login();
        testCases.AddCategory();
    }
}
