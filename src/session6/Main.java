package session6;

public class Main {
    public static void main(String args[]){
      //
      Animal anl = new Animal() {
          @Override
          public void run() {
              System.out.println("Run..");
          }
      };
      anl.run();
      Animal anl2 = new Animal() {
          @Override
          public void run() {
              System.out.println("Run..");
          }
      };
      Bird brd = new Bird(){
          @Override
          public void fly() {
              System.out.println("Fly..");
          }

          @Override
          public void eat() {
              System.out.println("Eat...");
          }
      };
      brd.fly();

      // lambda expression
      IHunman ih = ()->{
          System.out.println("Study...");
      };

        DaiBang d = new DaiBang();
        d.fly().fly2().run();// stream

    }
}
