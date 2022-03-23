package assignment.asm2;

public class Fraction {
    public int tuSo;
    public int mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void nhapPhanSo(){

    }

    public void inPhanSo(){

    }

    public void rutGon(){

    }

    public void nghichDao(){

    }


    public Fraction add(Fraction f){
        // cong f voi this
        int m = this.getMauSo() * f.getMauSo();
        int t = this.getTuSo() * f.getMauSo() + this.getMauSo()*f.getTuSo();
        Fraction fx = new Fraction();
        fx.setTuSo(t);
        fx.setMauSo(m);
        return fx;
    }

    // kieu 2 tham so
//    public Fraction add2(Fraction f1,Fraction f2){
//        int m = f1.getMauSo()*f2.getMauSo();
//        int t = f1.getTuSo() * f2.getMauSo() + f1.getMauSo()*f2.getTuSo();
//        Fraction fx = new Fraction();
//        fx.setTuSo(t);
//        fx.setMauSo(m);
//        return fx;
//    }

    public void sub(){

    }

    public void mul(){

    }

    public void div(){

    }
}
