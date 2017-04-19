package demo1;

/**
 * Created by Maria on 19.04.2017.
 */
public class Example {

    public static void main(String [] arg){
        Box myBox = new Box(2,2,2);
        System.out.println("Объем = " + myBox.getHeight() * myBox.getLength() * myBox.getWeight());

    }
}
