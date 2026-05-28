import java.util.Scanner;
public class BonusEligibility 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Working years in the company : ");
        int years=sc.nextInt();
        System.out.print("Enter your Attendance percentage :");
        double attendance=sc.nextDouble();
        System.out.print("Enter your Rating out of 5 :");
        int rating =sc.nextInt();
        if(years>3 && attendance>85)
        {
            if(rating==5)
            {
                System.out.println("Your Bonus Amount is 50,000");
            }
            else if(rating==4)
            {
                System.out.println("Your Bonus Amount is 30,000");
            }
            else if(rating==3)
            {
                System.out.println("Your Bonus Amount is 10,000");

            }
            else
            {
                System.out.println("You are not eligible for Bonus");
            }
            
        }
        else
        {
            System.out.println("You are not eligible for Bonus");
        }
        
        
    }
    
}
