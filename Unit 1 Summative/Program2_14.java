//Angela Luo
//8/30/2018
//Random phone number program

//imports 
import java.util.*;
public class Program2_14
{
   public static void main (String[] args){
       //creates random number generator
       Random generator = new Random();
       
       //creates random digits of sets of 3
       int  num2, num3, num11, num12, num13;
       
       //limit of first three: cannot contain 8 or 9
       num11 = generator.nextInt(8);
       num12 = generator.nextInt(8);
       num13 = generator.nextInt(8);
       
       
       //next 3 cannot be greater than 742
       num2 = generator.nextInt(643)+100;
       
       //no limitation on last 3 digits
       num3 = generator.nextInt(9000)+1000;
       
       //prints out phone number
       System.out.println("Random phone number: "+num11+num12+num13+"-"+num2+"-"+num3);
 
       
       
    }

}
//outputs
/*
 * Random phone number: 425-510-8224
 * Random phone number: 031-680-5106
 */