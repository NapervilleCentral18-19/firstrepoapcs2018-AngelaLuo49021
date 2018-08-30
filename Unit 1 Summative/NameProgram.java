//Angela Luo
//8/30/2018
//asks user for name and displays it

import java.util.*;
public class NameProgram
{
    public static void main (String[] args){
        //creates scanner input from keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //asks user for name
        System.out.println("What is your name? (First, Middle, and Last)");
        String name = new String(keyboard.nextLine());
        
        //finds spaces in names
        int space = name.IndexOf(" ");
        System.out.println(space);
        
        
        
    }
}
