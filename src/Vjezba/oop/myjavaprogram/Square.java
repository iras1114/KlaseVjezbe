package Vjezba.oop.myjavaprogram;

public class Square extends Shape{
    private  double a;
    private double b;

    public Square(int x, int y, String color, String name, double a, double b) {
        super(x, y, color, name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b ;
    }

}