//2) Write a Java programme to create a class called vehicle with a method called drive.
 //create a subclass called car that overwrites the drive method to print repairing a car
class vehicle{
    void drive(){
        System.out.println("Vechile is parked");
    }
}
class Car extends vehicle{
    void drive(){
        System.out.println("Repairing a car");
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Car o=  new Car();
        o.drive();
        vehicle v= new vehicle();
        v.drive();
    }
}
