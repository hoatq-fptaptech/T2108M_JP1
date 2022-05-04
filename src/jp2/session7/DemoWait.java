package jp2.session7;

public class DemoWait {
    public static void main(String args[]){
        Balance b = new Balance();
        Thread t1 = new Thread(()->{
            for (int i=0;i<10;i++){
                b.withdraw(200);
                try {
                    Thread.sleep(1000);
                }catch (Exception e){}
            }

        });
        Thread t2 = new Thread(()->{
            for (int i=0;i<20;i++){
                b.deposit(100);
                try {
                    Thread.sleep(1500);
                }catch (Exception e){}
            }
        });
        t1.start();
        t2.start();
    }
}
