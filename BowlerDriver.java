import java.util.Scanner;
/**
 * Write a description of class BowlerDriver here.
 *
 * @author Shiroya R.
 * @version (a version number or a date)
 */
public class BowlerDriver
{
    public static void main(String[] args)
    {
        Scanner in;
        //variables
        double first = 0;
        double second = 0;
        double third = 0;
        
        
        String name = "";
        double average = 0; 
        
        in = new Scanner (System.in);
        
        
        Bowler myBowler1;
        myBowler1 = new Bowler(name, first, second, third);
        
        System.out.print("Enter the name of the player: ");
        name = in.nextLine();
        System.out.print("Enter the first score: ");
        first = in.nextDouble();
        System.out.print("Enter the second score: ");
        second = in.nextDouble();
        System.out.print("Enter the third score: ");
        third = in.nextDouble();
        System.out.println("The average is " + myBowler1.calcAverage(first, second, third)) ;
        
        Bowler myBowler2;
        myBowler2 = new Bowler(name, first, second, third);
        in.nextLine();
        
        System.out.print("Enter the name of the player: ");
        name = in.nextLine();
        System.out.print("Enter the first score: ");
        first = in.nextDouble();
        System.out.print("Enter the second score: ");
        second = in.nextDouble();
        System.out.print("Enter the third score: ");
        third = in.nextDouble();
        System.out.println("The average is " + myBowler2.calcAverage(first, second, third)) ;
        
        
        
    }
}
