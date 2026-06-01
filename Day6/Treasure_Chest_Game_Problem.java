/*2)Treasure Chest Game Problem Statement

Create a class TreasureChest.

Variables playerName coinsCollected reward Requirement Coins >= 1000 → Diamond Sword Coins >= 500
 → Gold Sword Coins >= 100 → Iron Sword Else → Wooden Sword Constructor should decide reward. 
 Hint - Think like a game developer.

Player collects coins.

Constructor unlocks reward automatically. */

import java.util.Scanner;

public class Treasure_Chest_Game_Problem {
    String name ;
    int coins;
    String reward;
    Treasure_Chest_Game_Problem(String n, int c)
    {
        name = n;
        coins= c;
        if(coins>=1000)
        {
            reward="Diamond Sword";

        }
        else if(coins>=500 && coins <1000)
        {
            reward= "Gold Sword";
        }
        else if(coins>=100 && coins<500)
        {
            reward= "Iron Sword";
        }
        else
        {
            reward= "Wooden Sword";

        }
        
    }
    void display()
    {
        System.out.println("Player Name : "+name);
        System.out.println("Coins Collected : "+coins);
        System.out.println("Rewards : "+reward);
        System.out.println("------------------------------");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the player  : ");
        String name = sc.nextLine();
        System.out.print("enter the number of coins collected :");
        int coins =  sc.nextInt();
        System.out.println("------------------------------");
        Treasure_Chest_Game_Problem player = new Treasure_Chest_Game_Problem(name,coins);
        player.display();
                



    }
}
