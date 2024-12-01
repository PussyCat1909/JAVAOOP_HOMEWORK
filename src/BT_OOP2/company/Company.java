package BT_OOP2.company;

import BT_OOP2.person.Person;

public class Company extends Person {

    public static void main(String[] args) {
        Person person = new Person();
       person.setName("Hoa");
       person.setAge(19);
       person.setGender("Nữ");
        System.out.println("Họ tên : " + person.getName());
        System.out.println("Tuổi :"+ person.getAge());
        System.out.println("Giới tính : "+ person.getGender());



    }
}
