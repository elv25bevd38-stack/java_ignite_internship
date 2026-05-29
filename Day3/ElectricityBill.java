import java.util.Scanner;
public class ElectricityBill
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1 for Domestic \nEnter 2 for Commercial \nEnter 3 for Industrial ");
    System.out.print("Enter your choice :");
    int ch=sc.nextInt();
    switch(ch)
    {
        case 1:
        System.out.print("Enter the number of units consumed :");
        int units=sc.nextInt();
        int total=0;
        if(units>100 && units<300)
        {
            total=units*5;
            System.out.println("Your Electricity Bill is : "+total);
        }
        else if(units>300)
        {
            total=units*8;
            System.out.println("Your Electricity Bill is : "+total);
        }
        
        }

        break;

        case 2:
            System.out.print("Enter the number of units consumed :");
            int units1=sc.nextInt();
            int total1=0;
            if(units1<200)
            {
                total1=units1*10;
                System.out.print("Your Electricity Bill is : "+total1);
            }
            else if(units1>200)
            {
                total1=units1*15;
                System.out.print("Your Electricity Bill is : "+total1);
        }
        break;

        case 3:
        System.out.print("Enter the number of units consumed :");
        int units2=sc.nextInt();
        int total2=0;
        if(units2>500)
        {
            total2=units2*20*0.1;
            System.out.print("Your Electricity Bill is : "+total2);
        }
        else if(units2<500)
        {
            total2=units2*20;
            System.out.print("Your Electricity Bill is : "+total2);
        }
        break;
    }

   }
    


