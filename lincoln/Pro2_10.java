

//Angela Luo & Neil Choromokos
//August 23, 2018
import java.util.*;
public class Pro2_10
{
  public static void main (String[]args){
      
    Scanner keyboard = new Scanner (System.in);
    int x, y, z;
    
    //asks for triangle sides
    System.out.println("What is the 1st triangle side length?");
    x = keyboard.nextInt();
    System.out.println("What is the 2nd triangle side length?");
    y = keyboard.nextInt();
    System.out.println("What is the 3rd triangle side length?");
    z = keyboard.nextInt();
    
    //calculates semiperimeter
    double s = (x+y+z)/2;
    
    //calculates area
    double a = Math.sqrt(s*(s-x)*(s-y)*(s-z)) ;
    
    //prints results
    System.out.printf("The area of the triangle is %,.2f",a);
    
      
      
      
      
      
      
      
    }

}
