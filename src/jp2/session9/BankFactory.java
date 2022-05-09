package jp2.session9;

public class BankFactory {
    public static final Bank createBank(BankType bankType){ // factory method pattern
        switch (bankType){
            case TPBANK: return new TPBank();
            case VPBANK: return new VPBank();
            default:throw new IllegalArgumentException("Class not found");
        }
    }
}
