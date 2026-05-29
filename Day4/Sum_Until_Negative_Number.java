import java.util.Scanner;
public class Sum_Until_Negative_Number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num;
       do
        {
            System.out.print("Enter a number :");
            num = sc.nextInt();
            if(num<0)
            {
                System.out.print("The sum of the numbers entered is : " +sum);
                break;
            }
            else{
                sum=sum+num;
            }
        }
        while(num > 0);
    }

    
}
