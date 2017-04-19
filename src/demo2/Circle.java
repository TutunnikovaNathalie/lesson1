package demo2;

/**
 * Created by Maria on 19.04.2017.
 */
public class Circle extends Shape {
    private double radius;

    private final static double pi = 3.14;

    Circle(double radius,  String color) {
        super("круг", color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter(){
        return 2 * pi *radius;
    }

    public double getSquare(){
        return pi *radius *radius;
    }
}
