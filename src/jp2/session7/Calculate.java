package jp2.session7;

public class Calculate {
    Integer x =0;
    Integer y = 0;
    Integer z = 0;

    public synchronized void increment(){
        x++;
        y++;
        showParamethers();
    }

    public synchronized void showParamethers(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }

    public synchronized void incrementZ(){
        z++;
    }

    public synchronized void showZ(){
        System.out.println("z = "+z);
    }
}
