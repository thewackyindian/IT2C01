/**
 * @author : Raj Karan Singh Chhabra
 */
class Rectangle{
    float length,breadth;
    
    public Rectangle(float len,float bre)
    {
         this.length=len;
         this.breadth=bre;
    }
    public void area(){
        System.out.println("Area  is: "+ (length*breadth));
    }
    public void perimeter(){
        System.out.println("Perimeter  is: "+ 2*(length+breadth));
    }
}

class Square extends Rectangle
{   float side;
    public Square(float s) {
        super(s, s);
    }

}
public class Question2 {
    public static void main(String[] args){
        final long start_time = System.currentTimeMillis();
        
        Rectangle obj=new Rectangle(21,42);
        System.out.println("Rectangle: ");
        obj.area();
        obj.perimeter();

        System.out.println();
        Square obj2=new Square(6);
        
        System.out.println("Square: ");
        obj2.area();
        obj2.perimeter();
        final long end_time = System.currentTimeMillis();
        System.out.println("Executed in: "+(end_time-start_time)+" ms");

    }
}