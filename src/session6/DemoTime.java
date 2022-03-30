package session6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.TimeZone;

public class DemoTime {
    public static void main(String args[]){
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate ld2 = ld.plusDays(2);
        System.out.println(ld2);
        LocalDate ld3= ld.plusYears(1);
        System.out.println(ld3);
        LocalDate ld4 = ld.minusWeeks(2);
        System.out.println(ld4);
        //
        LocalDate ld5 = LocalDate.of(2021,5,12);
        System.out.println(ld5);
        // 2022-02-15
        LocalDate ld6 = LocalDate.parse("2022-02-15");


        // nhập 1 số nguyên, kiểm tra năm đó có phải năm nhuận hay ko?
//        Scanner sc = new Scanner(System.in);
//        int y = sc.nextInt();
//        try{
//            LocalDate ld7 = LocalDate.of(y,2,29);
//            System.out.println("Năm "+y+" là năm nhuận");
//        }catch (Exception e){
//            System.out.println("Năm "+y+" ko phải là năm nhuận");
//        }

        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt);
        LocalDateTime lt2 = LocalDateTime.of(2022,2,21,17,30,25);
        System.out.println(lt2);
        LocalDateTime lt3 = LocalDateTime.parse("2022-01-06T17:25:30");
        System.out.println(lt3);

        LocalDateTime lt4 = lt3.minusHours(1);

    }
}
