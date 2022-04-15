package jp2.session1;

public class Car {
    public int id;
    public String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+"-"+name;
    }
}
