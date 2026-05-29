import java.util.Scanner;
public class ATM_Simulation {
    public static void main(String[] args)
    {
        int org_pin=1234;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your pin :");
        int pin =sc.nextInt();
        while(pin!=org_pin)
        {
            System.out.println("Invalid pin ,try again");
            System.out.print("Enter your pin :");
            pin=sc.nextInt();
        }
        System.out.println("Pin accepted");

           
    }

    
}
