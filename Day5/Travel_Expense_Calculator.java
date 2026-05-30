/*2)Travel Expense Calculator

Create a program that:

Takes travel distance Takes mileage Takes petrol price per litre

Create a method that calculates travel cost and returns it.

Print: Estimated Travel Cost: X   

Hint First calculate: Petrol Needed Then: Travel cost Return final value. */
import java.util.Scanner;
public class Travel_Expense_Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the Travel distance (in km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter the Mileage (in Km/L) : ");
        double mileage = sc.nextDouble();
        System.out.print("Enter the petrol price per liter (in Rs) : ");
        double petrol_price = sc.nextDouble();
        double travel_cost = travel_cost_calculator(distance,mileage,petrol_price);
        System.out.println("Estimated Travel Cost : " + travel_cost + " Rs");
    }
    public static double travel_cost_calculator(double distance,double mileage,double petrol_price)
    {
        double travel_cost = (distance/mileage)*petrol_price;
        return travel_cost;
    };
}
