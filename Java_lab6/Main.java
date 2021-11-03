/**
 * @author : Raj Karan Singh Chhabra
import java.util.*; */

class Base {
    public void print() {
        System.out.println("Base");
    }
}

class Derived extends Base {
     public void print() {
        System.out.println("Derived");
    }
}

class Main {
    static void Doprint(Base b){
        b.print();
    }
    public static void main(String[] args) {
        final long start_time = System.currentTimeMillis();
        Base x= new Base();
        Derived y = new Derived();
        Derived z = new Derived ();
        Doprint(x);
        Doprint (y);
        Doprint(z);
        final long end_time = System.currentTimeMillis();
        System.out.println("Executed in: "+(end_time-start_time)+" ms");
    }
}
