

//Angela Luo
//8/27/2018
import java.util.*;
import java.text.NumberFormat;
public class Program2_12
{
   public static void main (String[] args){
       //creates scanner input from keyboard
       Scanner keyboard = new Scanner (System.in);
       
       //asks users for different coins
       System.out.println("Enter # of pennies: ");
       double p = keyboard.nextDouble();
       System.out.println("Enter # of nickels: ");
       double n = keyboard.nextDouble();
       System.out.println("Enter # of dimes: ");
       double d= keyboard.nextDouble();
       System.out.println("Enter # of quarters: ");
       double q = keyboard.nextDouble();
       
       //calculates value of coins
       
       double vp = p*.01;
       double vn = n*.05;
       double vd = d*.1;
       double vq = q*.25;
       double total = vp+vn+vd+vq;
       
       //creates currency formatting
       NumberFormat fmt = NumberFormat.getCurrencyInstance();
       
       //prints out results
       System.out.println("The total value of your coins is :"+fmt.format(total));
      
       
       
       
       
       
    }

}
