package demo3;

/**
 * Created by Maria on 19.04.2017.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c, String color){
        super("треугольник", color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getPerimeter(){
        return a + b + c;
    }

    public double getSquare(){
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - a ) * (p - b) * (p - c));
    }

    public double getSquare(double a, double h){
        return a * h /2;
    }
}
