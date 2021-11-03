/**
 * @author : Raj Karan Singh Chhabra
 */
interface Reasoning {
     /* compiler will treat them as: 
    * public abstract void canReason();
    */
    public void canReason();
}

interface Breathing {
     /* compiler will treat them as: 
    * public abstract void canBreath();
    */
    public void canBreath();
}

interface Movement {
    /* compiler will treat them as: 
    * public abstract void canMove();
    */
    public void canMove();
}

class Human implements Reasoning, Breathing, Movement {
    public void canReason() {
        System.out.println("Human can do Reasoning");
    }

    public void canBreath() {
        System.out.println("Human can Breath");
    }

    public void canMove() {
        System.out.println("Human can Move");
    }
}

class Animal implements Breathing, Movement
{
    public void canBreath() {
        System.out.println("Animals can Breath");
    }

    public void canMove() {
        System.out.println("Animals can Move");
    }
}

class Plants implements Breathing 
{
    public void canBreath() {
        System.out.println("Plants can Breath");
    }

}

class Question1 {
    public static void main(String[] args) {
        Reasoning h1 = new Human();
        h1.canReason();
        Breathing b1 = new Human();
        Breathing b2 = new Animal();
        Breathing b3 = new Plants();
        b1.canBreath();
        b2.canBreath();
        b3.canBreath();
        Movement m1 = new Human();
        Movement m2 = new Animal();
        m1.canMove();
        m2.canMove();
    }
}