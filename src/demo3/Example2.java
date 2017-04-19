package demo3;

/**
 * Created by Maria on 19.04.2017.
 */
public class Example2 {

    public static  void main(String[] args){
    Circle circle = new Circle(2, "красный");
    Triangle triangle = new Triangle(2,2,2, "синий");
    triangle.printInfo();
    circle.printInfo();
    }
}
