package assignment.asm2;

public class Main {
    public static void main(String args[]){
        Fraction f1 = new Fraction();
        f1.setTuSo(1);
        f1.setMauSo(2);

        Fraction f2 = new Fraction();
        f2.setTuSo(1);
        f2.setMauSo(3);

//        f1.add2(f1,f2);
//        // hoac
//        f2.add2(f1,f2);
//
//        Fraction f3 = new Fraction();
//
//        f3.add2(f1,f2);

        Fraction fx = f1.add(f2);

        System.out.println("Ket qua:"+fx.getTuSo()+"/"+fx.getMauSo());
    }
}
