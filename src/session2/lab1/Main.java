package session2.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        TamGiac tg = new TamGiac();
        // nhap 3 canh tam giac
        Scanner sc = new Scanner(System.in);
        tg.setC1(sc.nextInt());
        tg.setC2(sc.nextInt());
        tg.setC3(sc.nextInt());

        System.out.println("Chu vi:"+tg.chuVi());
        System.out.println("Dien tichL "+tg.dienTich());

    }
}
