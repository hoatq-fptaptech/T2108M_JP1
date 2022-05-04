package jp2.session7;

public class Balance {
    Integer balance = 0;

    public synchronized void deposit(int money){
        balance += money;
        System.out.println("Deposit: "+money);
        notify();
    }

    public synchronized void withdraw(int money){
//        if(money > balance){
//            System.out.println("Not enough money...");
//        }
//        balance -= money;
//        System.out.println("Withdraw: "+money);
        while (money > balance){
            System.out.println("Not enough money...");
            System.out.println("Waiting...");
            try {
                wait();
            }catch (Exception e){}
        }
        balance -= money;
        System.out.println("Withdraw: "+money);
    }
}
