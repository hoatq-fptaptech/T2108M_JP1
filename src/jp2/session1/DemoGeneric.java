package jp2.session1;

public class DemoGeneric {
    public static void main(String args[]){
        Moto<String,String> honda = new Moto<>("AZ123","SM321");
        String s1 = honda.getSoKhung();

        Moto<Integer,String> yamaha = new Moto<>(123,"YM123");
        int k1 = yamaha.getSoKhung();

        yamaha.showInfo("abc");
        yamaha.showInfo(5);
        yamaha.showInfo(3.14);

        Yamaha<Integer,Car> y1 = new Yamaha<>();
        y1.setSoMay(new Car(1,"T212"));

    }
}
