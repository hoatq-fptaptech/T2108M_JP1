package session2;

import java.util.Scanner;

public class SinhVien { // khai báo 1 lớp SinhVien
    String name;
    int age;
    Classroom myClass;

    public SinhVien(){ // constructor
        System.out.println("Constructor running..");
        this.inputName();
    }

    void study(){
        System.out.println(this.name+" lop: "+this.myClass.name
                +" Study, tai phong "+this.myClass.room);
    }
    void inputName(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }
}
