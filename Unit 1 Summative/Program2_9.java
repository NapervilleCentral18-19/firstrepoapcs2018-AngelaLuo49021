

//Angela and Neal
//8/24/2018
//finds area and circumference of a circle
import java.util.*;
import java.text.DecimalFormat;
public class Program2_9
{
   public static void main (String[] args){
       //creates scanner for input
       Scanner keyboard = new Scanner(System.in);
       
       //asks user for radius of circle
       System.out.println("Enter radius of circle:");
       double radius = keyboard.nextDouble();
       
       //calculates circumference and area
       double cir= (radius*2*Math.PI);
       double area = Math.PI*Math.pow(radius, 2);
       
       //creates format for 4 decimal places
       DecimalFormat fmt = new DecimalFormat ("0.####");
       
       //prints results
       System.out.println("Circumference of circle:"+fmt.format(cir));
       System.out.println("Area of circle:"+fmt.format(area));
       
       
       
       
       
    }

}
