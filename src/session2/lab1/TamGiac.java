package session2.lab1;

public class TamGiac {
    int c1;
    int c2;
    int c3;

    public TamGiac(){

    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getC3() {
        return c3;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }

    int chuVi(){
        //
        return getC1()+getC2()+getC3();
    }

    double dienTich(){
        //
        double cv2 = (double) chuVi()/2;
        return Math.sqrt(cv2*(cv2-getC1())*(cv2-getC2())*(cv2-getC3()));
    }
}
