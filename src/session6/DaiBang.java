package session6;

public class DaiBang extends Animal {
    @Override
    public void run() {

    }

    public DaiBang fly(){
        System.out.println("Dai bang fly");
        return this;
    }

    public DaiBang fly2(){
        System.out.println("Fly 2..");
        return this;
    }

}
