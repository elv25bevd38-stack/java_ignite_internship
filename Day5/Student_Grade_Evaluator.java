/*4)Student Grade Evaluator

Create a program that:

Takes marks as input

Create a method that returns:

A Grade B Grade C Grade Fail based on marks.

Print returned result.

Hint Method return type should not be int Think about what type of value is returned   */

import java.util.Scanner;
public class Student_Grade_Evaluator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks obtained out of 100 : ");
        int marks =  sc.nextInt();
        String grade =  evaluate_grade(marks);
        System.out.println("The Grade obtained is : " + grade );
    }
    public static String evaluate_grade(int marks)
    {
        if(marks>=90)
        {
            return "A Grade ";
        }
        else if(marks>=75 && marks<90)
        {
            return "B Grade ";
        }
        else if(marks>=60 && marks<75)
        {
            return "C Grade ";
        }
        else
        {
            return "Fail !!!!";
        }
        
    }
    
}
