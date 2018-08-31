//Angela Luo
//8/30/2018
//asks user for name and displays it as..
//First M.
//Last

import java.util.*;
public class NameProgram
{
    public static void main (String[] args){
        //creates scanner input from keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //asks user for name
        System.out.println("What is your name? (First, Middle, and Last)");
        String name = new String(keyboard.nextLine());
        
        //finds space for first name
        int space = name.indexOf(" ");
        
        //creates substring for first name
        String first = new String(name.substring (0,space));
        
        //creates char for middle initial
        char middle = name.charAt(space+1);
       
        
        //creates substring for rest of the name after the first name
        String rest = new String(name.substring (space+1));
        
        //finds space after middle name
        int space1 = rest.indexOf(" ");
        
        //creates substring for last name
        String last = new String(rest.substring (space1+1));
        
        //prints out results
        System.out.println(first+" "+middle+".\n"+last);
    
        
       
        
        
    }
}
/*
 * output:
 * What is your name? (First, Middle, and Last)
 * Penny Nickel Dime
 * Penny N.
 * Dime
 * 
 * 
 * output 2:
 * What is your name? (First, Middle, and Last)
 * Angela Elle Luo
 * Angela E.
 * Luo


 */