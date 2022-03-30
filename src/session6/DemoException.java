package session6;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoException {
    public static ArrayList arr;
    public static void main(String args[]) throws NullPointerException {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y==0){
                throw new NullPointerException("Nhập nhầm số 0 rồi!");
            }

            x++;
            int z = x / y;
            System.out.println("z = " + z);
            DemoException.arr.add(1);
        }catch (NullPointerException e){
            System.out.println("Null:"+e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println("Ari:" + e.getMessage());
        }catch (Exception e){
            System.out.println("Err:"+e.getMessage());
        }finally {
            System.out.println("Finish");
        }

    }
}
