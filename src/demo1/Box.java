package demo1;

/**
 * Created by Maria on 19.04.2017.
 */
public class Box {

    private double length;
    private double weight;
    private double height;

    Box(double length, double weight, double height){
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }


    public double getHeight() {
        return height;
    }


}
