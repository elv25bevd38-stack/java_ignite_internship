import java.util.Scanner;

public class travel
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total distance (in km):");
		double dist = sc.nextDouble();
		System.out.println("Enter vehicle mileage:");
		double mileage = sc.nextDouble();
		System.out.println("Enter petrol price per litre:");
		double price = sc.nextDouble();
		System.out.println("Total petrol: "+(dist/mileage)+"litres");
		System.out.println("Total travel cost: Rs."+(price*(dist/mileage)));
		sc.close();
	}

}