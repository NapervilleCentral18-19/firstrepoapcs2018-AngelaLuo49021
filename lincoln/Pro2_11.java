

//Angela & Neil
//8/24/18
import java.util.*;
public class Pro2_11
{
   public static void main (String[]args){
   
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter your starting odmeter reading: ");
       double odometer_start = scan.nextDouble();
       
       System.out.println("Enter your ending odmeter reading: ");
       double odometer_ending = scan.nextDouble();
       
       System.out.println("How much gas did you use for this trip: ");
       double gas = scan.nextDouble();
       
       double mpg =(odometer_ending - odometer_start) / gas;
       
       System.out.println("Your miles per gallon is: " + mpg+ " mpg");
       
       
       
       
       
    }

}
