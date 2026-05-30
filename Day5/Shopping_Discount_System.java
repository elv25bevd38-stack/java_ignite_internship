import java.util.Scanner;
public class Shopping_Discount_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Bill Amount : ");
        double billamount = sc.nextDouble();
        System.out.print("Enter the Discount in percentage : ");
        double discount = sc.nextDouble();
        double final_amount=calculate_discount(billamount,discount);
        System.out.println("The Final Amount after discount is : " +final_amount);

    }
    public static double calculate_discount(double billamount , double discount)
    {
        double discount_amount = (billamount * discount)/100;
        double final_amount = billamount - discount_amount;
        return final_amount;
    }
}
