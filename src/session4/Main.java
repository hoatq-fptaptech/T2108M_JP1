package session4;

import java.util.ArrayList;

public class Main {
    public int year;
    public static int numberYear; // as global variable

    public static void main(String args[]){
        System.out.println("Hello world!");
        Main.numberYear = 20;
        Main m = new Main();
        m.year = 2022;
        m.sayHello();

        Main.reading();

        int x; //x =0;
        Main ma;// null
        ma = new Main();// co o nho -> biến phải có giá trị thì mới có ô nhớ
        Main m2;
        Main m3;
        ArrayList<String> arr;
       arr = new ArrayList<>();
       arr.add("aaa");

       //Car c = new Car();
       BMW b = new BMW();
    }

    public void sayHello(){
        Main.reading();
    }

    public void go(){
        this.sayHello();
    }

    public static void reading(){
       // this: trong static ko co this
    }
}
