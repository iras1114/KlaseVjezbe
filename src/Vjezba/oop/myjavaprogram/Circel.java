package Vjezba.oop.myjavaprogram;

public class Circel extends Ellipse {

    private double r;

    public Circel(int x, int y, String color, String name, double r) {
        super(x, y, color, name);
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return r * r * Math.PI;
    }
}


