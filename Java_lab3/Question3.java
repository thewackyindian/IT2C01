/**
 * @author : Raj Karan Singh Chhabra
 */

class Shape{
    public void perimeter(int radius){
        System.out.println("Perimeter of circle "+2*3.14*radius);
    }

    public void perimeter(int length, int breadth){
        System.out.println("Perimeter of rectangle "+length*breadth);
    }
}
public class Question3{

    public static void main (String[] args){
        Shape s = new Shape();

        s.perimeter(28, 29);

        s.perimeter(15);
    }
}