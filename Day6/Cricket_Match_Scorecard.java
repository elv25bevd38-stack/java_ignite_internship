 /*1)Cricket Match Scorecard Problem Statement

Create a class Batsman.

Variables playerName runs balls strikeRate Requirement

Formula: Strike Rate = (runs * 100) / balls Calculate strike rate inside constructor. new Batsman("Gill",75,50); Output - Strike Rate = 150 Hints - Perform calculations in constructor.

display() should only print results.*/

import java.util.Scanner;
import java.util.Scanner;

public class Cricket_Match_Scorecard {
    String name;
    int runs;
    int balls;
    double strikerate;
    Cricket_Match_Scorecard(String n, int r,int b)
    {
        name = n;
        runs = r;
        balls = b;
        strikerate=(runs*100)/balls;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Runs : "+runs);
        System.out.println("balls :"+balls);
        System.out.println("Strike Rate : "+strikerate);
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the player : ");
        String name = sc.nextLine();
        System.out.print("Enter the runs :");
        int runs = sc.nextInt();
        System.out.print("Enter the number of balls : ");
        int balls = sc.nextInt();
        Cricket_Match_Scorecard player = new Cricket_Match_Scorecard(name,runs,balls);
        player.display();
        System.out.println("------------------------------");
    }


    
}
