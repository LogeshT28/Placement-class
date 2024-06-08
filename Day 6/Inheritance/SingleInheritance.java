import java.util.Scanner;
class Car{
    public void Speed(int s){
        int Speed = s;
        System.out.println("Speed of the Car is :"+Speed);
    }
    public void Wheel(int s){
        int wheel = s;
        System.out.println("No of Wheels in Car :"+wheel);
    }
}

class SingleInheritance extends Car {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            SingleInheritance obj = new SingleInheritance();
            System.out.println("Enter the car Speed");
            int Speed = s.nextInt();
            System.out.println("Enter the No of Wheels in car");
            int wheel = s.nextInt();
            obj.Speed(Speed);
            obj.Wheel(wheel);
        }
}
