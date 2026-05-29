import java.util.Scanner;
public class square {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print its square from 0 :");
        int num = sc.nextInt();
        System.out.println("The square of numbers from 0 to "+num+" is :");
        for(int i=0;i<=num;i++)
        {
            System.out.println("i ->  " +i*i);
        }
    }
    
}
