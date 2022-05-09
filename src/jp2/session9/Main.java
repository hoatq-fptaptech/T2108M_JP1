package jp2.session9;

public class Main {
    public static void main(String args[]){
        TPBank tp = (TPBank)BankFactory.createBank(BankType.TPBANK);
        tp.showInfo();
        VPBank vp = (VPBank)BankFactory.createBank(BankType.VPBANK);
    }
}
