package session2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int x;
       SinhVien sv = new SinhVien();
       sv.age = 20;
       x= 10;
       SinhVien maivannam = new SinhVien();
       Classroom c = new Classroom();
       sv.myClass = c;
       sv.study();
       maivannam.study();

    }
}
