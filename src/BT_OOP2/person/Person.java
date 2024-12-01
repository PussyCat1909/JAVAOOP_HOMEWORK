package BT_OOP2.person;

public class Person {
    public String name ;
    public int age;
    public String gender;
    protected String address;
    protected String phone;

    public Person(java.lang.String name, int age, java.lang.String gender, java.lang.String address, java.lang.String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }

    public java.lang.String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public java.lang.String getGender() {
        return gender;
    }

    public Person(){

}
    protected void showinfo(){
        System.out.println("Họ tên : " + name);
        System.out.println("Tuổi : "+ age);
        System.out.println("Giới tính : " + gender);
        System.out.println("Địa chỉ : " + address);
        System.out.println("Điện thoại : " + phone);
    }
}
