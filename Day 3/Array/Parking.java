import java.util.Scanner;
public class Parking {
    static int slot[] = {0,0,0,0,0,0,0,0,0,0};
    static int size = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        while(choice!=3){
            System.out.println("Enter 1 for Parking Your Car ");
            System.out.println("Enter 2 for picking your car");
            System.out.println("Enter 3 for Quit");
            System.out.println("Enter Your Choice");
            choice = s.nextInt();
            if(choice==1){
                if(size == slot.length){
                    System.out.println("Parking Slot Full !!");
                }
                else{
                    int slotno =0;
                    while (true) {
                        System.out.println("Enter your Slot Number :");
                        slotno = s.nextInt();
                        if(slot[slotno] == 0){
                            break;
                        }
                        System.out.println("vehicle is parked");
                    }
                    System.out.println("Enter your Vehicle Number :");
                    int vehicleNo = s.nextInt();
                    slot[slotno] = vehicleNo;
                    size++;
                    System.out.println("Vehicle Is Parked ");
                }
            }
            else if(choice ==2){
                System.out.println("Enter your Vehicle Number :");
                int vehicleNo = s.nextInt();
                boolean temp = false;
                int slotno = 0;
                for(int i=0;i<slot.length;i++){
                    if(slot[i] == vehicleNo){
                        slotno = i;
                        temp =true;
                    }
                }
                if(temp){
                    slot[slotno] = 0;
                    System.out.println("The Vehicle is Picked from Parking");
                    size--;
                }
                else{
                    System.out.println("The Vehic le Not Found");
                }
            }
        }
    
    }
}
