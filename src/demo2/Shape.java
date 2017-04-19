package demo2;

/**
 * Created by Maria on 19.04.2017.
 */
public class Shape {
    private String name;
    private String color;

    Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void printInfo(){
        System.out.println(color + " " + name);
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
