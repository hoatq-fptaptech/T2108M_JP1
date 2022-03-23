package session3;

import session2.SinhVien;
import session3.demo1.Vietnamese;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList arl = new ArrayList();
        arl.add(1);
        arl.add(3.14);
        arl.add("hello");
        arl.add(new SinhVien());

        // quy dinh ro rang kieu du lieu cua phan tu
        ArrayList<Integer> arrNum =  new ArrayList<Integer>();
        arrNum.add(5);
        arrNum.add(2);
        //arrNum.add(3.14);
       // arrNum.add("hello");
        ArrayList<String> arrS = new ArrayList<>();

        System.out.println("arrNum[0]="+arrNum.get(0));// arrNum[0]
        arrNum.remove(2);// xoa số 2 khỏi mảng

        ArrayList<SinhVien> arrSv = new ArrayList<>();
        arrSv.add(new SinhVien());

        Vietnamese v1 = new Vietnamese();
       // v1.telephone = "1111";
    }
}
