/*3)Battle Arena Winner

Create a program that:

Takes Player 1 score Takes Player 2 score

Create a method that returns: Player 1 Wins Player 2 Wins Match Draw

Print returned result. Hint Use if-else inside method Return text result   */
import java.util.Scanner;
public class Battle_Arena_Winner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Player 1 : ");
        String player1 = sc.nextLine();
        System.out.print("Enter the name of Player 2 : ");
        String player2 = sc.nextLine();
        System.out.print("Enter the score of Player 1 : ");
        int score1 = sc.nextInt();
        System.out.print("Enter the score of Player 2 : ");
        int score2 = sc.nextInt();
        String winner = determine_winner(score1,score2,player1,player2);
        System.out.println(winner);

    }
    public static String determine_winner(int score1,int score2,String player1,String player2)
    {
        if(score1>score2)
        {
            return player1 + " Wins...";
        }
        else if(score2>score1)
       {
            return player2 + "  Wins...";
       }
       else
       {
            return "Match Draw!!!";
       }
    }
 }
    
