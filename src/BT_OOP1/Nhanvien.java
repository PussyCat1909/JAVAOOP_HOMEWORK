package BT_OOP1;

public class Nhanvien {
    public String name ;
    public int age;
    public String gender;
    public String address;
    public String phone;

    public Nhanvien(java.lang.String name, int age, java.lang.String gender, java.lang.String address, java.lang.String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public void showinfo(){
        System.out.println("Họ tên : " + name);
        System.out.println("Tuổi : "+ age);
        System.out.println("Giới tính : " + gender);
        System.out.println("Địa chỉ : " + address);
        System.out.println("Điện thoại : " + phone);
    }

}
