import java.util.Scanner;

public class constructor
{
    int id;
    String name;
    constructor(int id,String name)
    {
        this.id=id;
        this.name=name;

    }
    public static void main(String[] args)
    {
        constructor E1 = new constructor(1, "Alice");
        constructor E2 = new constructor(2, "Bob");
        constructor E3 = new constructor(3, "Charlie");
        E1.display();
        E2.display();
        E3.display();
    }
    void display()
    {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
}
