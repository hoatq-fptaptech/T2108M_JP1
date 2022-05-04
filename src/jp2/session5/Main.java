package jp2.session5;

public class Main {
    public static void main(String args[]){
        int x=10;
        SubT1 st1 = new SubT1();
        st1.setName("Thread ST1");
        st1.y= x;
        st1.start();
        SubT1 st2 = new SubT1();
        st2.setName("Thread ST2");
        st2.start();

        // Runnable
        SubT2 sub = new SubT2();
        Thread t = new Thread(sub);
        t.start();

        // anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread t2 = new Thread(r1);
        t2.start();

        // lambda expression
        Runnable r2 = ()->{

        };
        Thread t3 = new Thread(r2);
        t3.start();

        // rut gon
        new Thread(()->{
            for(int i=0;i<x;i++){

            }
        }).start();

        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+ " i="+i);
            try {
                Thread.sleep(1000);//1000 ms
            }catch (Exception e){

            }
        }
    }
}
