package jp2.session5;

public class SubT1 extends Thread{
    int y;
    @Override
    public void run() {
        for(int i=0;i<y;i++){
            System.out.println(Thread.currentThread().getName()+" i="+i);
            try {
                Thread.sleep(1000);//1000 ms
            }catch (Exception e){

            }
        }
    }
}
