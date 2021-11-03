/**
 * @author : Raj Karan Singh Chhabra
 */
class Shape{
    public void print_shape(){
        System.out.println("This is This is shape");
    }
}
    // Rectangle class is subclass of Shape class
class Rectangle extends Shape{
    public void print_rectangle(){
        System.out.println("This is rectangle");
    }
}
// Circle class is subclass of Shape class
class Circle extends Shape{
    public void print_circle(){
        
    }
}
// Square class is subclass of Rectangle class
class Square extends Rectangle{
    public  void print_square(){
        System.out.println("Square is a rectangle");
    }
}
    
public class Question4{
    public static void main(String[] args){
        final long start_time = System.currentTimeMillis();
        Square sq = new Square();
        sq.print_shape();
        sq.print_rectangle();
        final long end_time = System.currentTimeMillis();
        System.out.println("Executed in: "+(end_time-start_time)+" ms");
    }
}