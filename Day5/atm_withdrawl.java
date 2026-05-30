import java.util.Scanner;
public class atm_withdrawl 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the ATM");
        System.out.print("Enter amount to withdraw :");
        int amount=sc.nextInt();
        int res=withdraw(amount);
        if(res!=0)
        {
            System.out.println("your amount is withdrawn : "+res);
        }
        sc.close();



    }
    public static int withdraw(int amount)
    {
        int balance=100000;
        int res=pin();
        if(res==1)
        {
            if(amount<balance)
            {
                balance=balance-amount;
                return amount;
            }
            else
             {
                System.out.println("Insufficent balance ");
                return 0;
            }
        }
        else
        {
            System.out.println("Transaction failed");
            return 0;
        }
    }
    public static int pin()
    {
        int org_pin=1234;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your pin : ");
        int pin=sc.nextInt();
        if(pin==org_pin)
        {
            return 1;
        }
        else
        {
            System.out.println("Invalid pin");
            return 0;
        }
        
    }
    
}