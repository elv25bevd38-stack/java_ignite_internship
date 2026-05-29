import java.util.Scannner;
public class multiplication_table{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to print multiplication table  : ");
        int num=sc.nextInt();
        System.out.printLn("Multiplication table of "+num+" is :");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x"+i+"="+num*i);
        }

        
    }
    
}
