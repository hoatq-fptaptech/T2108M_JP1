package session7;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]){
        int x = 20;
        if(x>Demo.minYearOld){
            System.out.println("x > 18");
        }
        System.out.println(Demo.GENDER.Male);
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getDayOfWeek());
    }
}
