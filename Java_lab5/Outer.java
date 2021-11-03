/**
 * @author : Raj Karan Singh Chhabra
 */
public class Outer {
    void method1() {
        class InnerClass {
            public void msg(){
                System.out.println("This is an inner class");
            }
        }
        InnerClass ins = new InnerClass();
        ins.msg();
    }

    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.method1();
    }
}