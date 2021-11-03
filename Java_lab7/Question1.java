/**
 * @author : Raj Karan Singh Chhabra
 */
abstract class Vehicle{
    abstract void brake();
    abstract void controlMechanism();
}
abstract class Twowheeler extends Vehicle{
    public void controlMechanism(){
        System.out.println("Handle based controlling.");
    }
}
abstract class Fourwheeler extends Vehicle{
    public void controlMechanism(){
        System.out.println("steering based controlling.");
    }
}
class Car extends Fourwheeler{
    public void brake(){
        System.out.println("Drum type brake system.");
    }

}
class Bike extends Twowheeler{
    public void brake(){
        System.out.println("Disk type brake system.");
    }
}


class Question1
{
    public static void main(String[] args) {
        Vehicle car= new Car();
        Vehicle bike= new Bike();
        car.brake();
        car.controlMechanism();
        bike.brake();
        bike.controlMechanism();

    }
}