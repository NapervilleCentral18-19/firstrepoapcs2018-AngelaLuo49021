//Angela Luo & Neil Choromokos
//August 23, 2018
import java.util.*;
public class Pro2_10
{
  public static void main (String[]args){
      
    Scanner keyboard = new Scanner (System.in);
    int x, y, z;
    System.out.println("What is the 1st triangle side length?");
    x = keyboard.nextInt();
    System.out.println("What is the 2nd triangle side length?");
    y = keyboard.nextInt();
    System.out.println("What is the 3rd triangle side length?");
    z = keyboard.nextInt();
    double s = (x+y+z)/2;
    double a = Math.sqrt(s*(s-x)*(s-y)*(s-z)) ;
    System.out.println("The area of the triangle is "+a);
    
      
      
      
      
      
      
      
    }

}
