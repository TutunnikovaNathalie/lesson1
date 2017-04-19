package demo3;

/**
 * Created by Maria on 19.04.2017.
 */
public abstract class Shape implements IShape {
    private String name;
    private String color;

    public abstract double getSquare();

    public abstract double getPerimeter();

    Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void printInfo(){
        System.out.println(color + " " + name);
        System.out.println("Площадь = " + getSquare());
        System.out.println("Периметер = " + getPerimeter());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
