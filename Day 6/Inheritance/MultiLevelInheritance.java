import java.util.Scanner;

class Car{
    String CarName;
    int CarNum;
    int CarSpeed;
}
class ShowCar extends Car{
    ShowCar(String CarName,int CarNum,int CarSpeed){
        this.CarName = CarName;
        this.CarNum = CarNum;
        this.CarSpeed = CarSpeed;
    }
    public void Show(){
        System.out.println("carName :"+CarName);
        System.out.println("carNum :"+CarNum);
        System.out.println("carSpeed :"+CarSpeed);
    }
}

public class MultiLevelInheritance {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int carnum = s.nextInt();
            s.nextLine();
            String carName = s.nextLine();
            int carspeed = s.nextInt();
            ShowCar obj  = new ShowCar(carName, carnum, carspeed);
            obj.Show();
        }

    }
    
