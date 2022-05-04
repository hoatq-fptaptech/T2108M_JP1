package jp2.session7;

public class DemoSync {
    public static void main(String args[]){
        Calculate c = new Calculate();
        Thread t1 = new Thread(()->{
            for (int i=0;i<100;i++){
//                synchronized (c){
                    c.increment();
                   // c.showParamethers();
//                }
                try {
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0;i<100;i++){
//                synchronized (c){
                    c.increment();
//                    c.showParamethers();
//                }
                try {
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
        });
        Thread t3 = new Thread(()->{
            for (int i=0;i<100;i++){
//                synchronized (c){
                    c.incrementZ();
                    c.showZ();
//                }
                try {
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
