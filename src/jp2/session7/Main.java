package jp2.session7;

public class Main {
    private static int stk = 0;
    public static void main(String[] args){
        Thread t1 = new Thread(()->{
           System.out.println("Mo tai khoan");
           try {
               Thread.sleep(3000);
           }catch (Exception e){}
            stk = 1000;
            System.out.println("Mo thanh cong tai khoan:"+stk);
        });
        Thread t2 = new Thread(()->{
            System.out.println("Lam the ATM cho stk: "+stk);
            try {
                Thread.sleep(3000);
            }catch (Exception e){}
        });
        Thread t3 = new Thread(()->{
            System.out.println("KT so du tai khoan stk: "+stk);
            try {
                Thread.sleep(3000);
            }catch (Exception e){}
        });
        Thread t4 = new Thread(()->{
            try {
                Thread.sleep(3000);
            }catch (Exception e){}
            System.out.println("Nap tien vao stk: "+stk);
        });

        Thread t5 = new Thread(()->{
            System.out.println("Chuyen khoan");
            try {
                Thread.sleep(3000);
            }catch (Exception e){}
        });

        t1.start();
        try{
            t1.join();
        }catch (Exception e){

        }
        t2.start();
        t3.start();
        t4.start();
        try {
            t4.join();
        }catch (Exception e){}
        t5.start();
    }
}
