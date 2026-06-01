/*3)Create a Smart Parking System Attributes - Vehicle Number Hours Parked Vehicle Type Parking Fee Rules - Bike → ₹10/hour Car → ₹30/hour Bus → ₹50/hour Constructor should:

Receive details. Calculate fee. Store final fee.*/

import java.util.Scanner;
public class Smart_Parking_System {
    String vehicle_number;
    int hours_parked;
    String vehicle_type;
    int parking_fee=0;
    Smart_Parking_System(String v, int h, String t)
    {
        vehicle_number=v;
        hours_parked=h;
        vehicle_type=t;
        if(vehicle_type=="Bike")
        {
            parking_fee = 10*hours_parked;
        }
        else if(vehicle_type=="Car")
        {
            parking_fee = 30*hours_parked;
        }
        else if(vehicle_type=="Bus")
        {
            parking_fee = 50*hours_parked;

        }
        else
        {
            parking_fee = 0;
        }
        
    }  
    void display()
    {
        System.out.println("Vehicle Number : "+vehicle_number);
        System.out.println("Hours parked : "+hours_parked);
        System.out.println("Vehicle type : "+vehicle_type);
        System.out.println("Parking Fee :"+parking_fee);
        System.out.println("------------------------------");
    }
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Vehicle Number :  ");
        String v = sc.nextLine();
        System.out.print("enter hours parked :");
        int h = sc.nextInt();
        System.out.print("Enter Vehicle Type : ");
        String t = sc.next();
        System.out.println("------------------------------");
        Smart_Parking_System vehicle = new Smart_Parking_System(v,h,t);
        vehicle.display();


    }
}
