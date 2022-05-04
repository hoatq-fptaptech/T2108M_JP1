package jp2.session5;

public class DemoDaeMon {
    public static void main(String args[]){
        Thread t1 = new Thread(()->{
            for(int i=0;i<20;i++){
                System.out.println("T1 i="+i);
                try {
                    Thread.sleep(1000);//1000 ms
                }catch (Exception e){

                }
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("T2 i="+i);
                try {
                    Thread.sleep(1000);//1000 ms
                }catch (Exception e){

                }
            }
        });
        t1.setDaemon(true);
        t1.start();
        t2.start();
        System.out.println("Main finish");
    }
}
