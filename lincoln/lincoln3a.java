//Angela Luo
//Auguest 20, 2018
//example 1.1
//first program to test output - description

// import sections
import java.util.Scanner;

public class lincoln3a          //must have a class & file name math!!!
{
public static void main  (String[] args)    // must have main
{
    //primitive data types
    int x, y, z;
    x=5;
    z=21;
    //x=5.5; // error, double not an integer
    double num,num1,cel;
    float num3; // = double but less memory 4 bytes
    char letter= 'a'; //use single quote //has integer value
    boolean love = false;
    double total = 1499.897;
    double height = 10;
    
    // can't use reserved words 
    //int this;
//--------------------objects----------------------
/*
    //class name      id     memory      constructor
    String            word = new         String ("Screen Protector");
    //p.90--scanner method
    Scanner           keyboard = new     Scanner(System.in);
    String name = new String ("Angela");
    String name1 = new String ("Angela");
    String name2 = new String("Zachhh");
    
    System.out.print("What is ur age?\n");
    int age = keyboard.nextInt();//returns the data type (int);
    
    System.out.print("What is ur name?\n");
    keyboard.nextLine();// be careful with both integers and strings
    //String name = keyboard.next();//gets input upto next space
    name = keyboard.nextLine();//gets input upto next line
    System.out.print("\n"+name +" is "+age+" years old");
//__________________wrapper class integer and double___________-_
//Autoboxing
Integer obj;//old way = new Integer(56);
int d = 56;
obj = d; //automatically creates an Integer object
int p = obj;
System.out.print(obj == age);
System.out.print(obj.equals(age));
System.out.print(obj.compareTo(100));

*/
//Strings are immutable
name = new String("Homie");
name = "Homer";
/*    
    //p88 math class - What is different about the math class? Math is a Static class (dont need to instantiate/make an object
    
    double cylinder = Math.PI * Math.pow(5,2)*height;
    System.out.println("Cylinder "+cylinder);

System.out.print("The square root of 21 is "+Math.sqrt(z));    
*/


    
    /*
    //p. 78 are string methods you must know AP Test
    //len(word) - function
    System.out.println(word.length());
    
    //get part of a String --index starts at 0
    System.out.println(word.substring(8));
    System.out.println(word.substring(7,14));
    System.out.println(word.substring(7,16));//n, n-1
    
    //System.out.println(word.charAt(16)); // error out of bounds not n-1
    System.out .println(word.indexOf("P"));
    System.out.println(name == name1); //--compares to see if they are the same object, compares the memory address
    System.out.println(name.equals(name1));//are they equal
    System.out.println(name.compareTo(name2));//first one in relation to the second one. Gives +1 if greater, 0 if equal, - if less than
*/  
//     System.out.println("A quote by Abraham Lincolin:"  );
//  System.out.println("Whatever you are, be a good one."  );
/*    
    System.out.println(letter);
    System.out.println(letter + 1);
    // this is casting the number of 98 to the char b
    System.out.println((char)(letter + 1));
*/    
    //mathematical problems
    //integer
   // cel = (75 - 32) *(5/9);
   //__________________casting and promotion________________
    //promotion
    //cel = (75 - 32) *(5.0/9); //promotes 9 to a double and the result promotes the 75-32
    //cast
   // cel = (75 - 32) *(double)x/9;//promotes 9 to a double and the result promotes the 75-32

    
    //System.out.println("Celsius temp is " + cel);
    //________________Print Formatiing
    //System.out.printf("Total is: $%,.2f%n",total);
    //System.out.printf("Total:%-10.2f: ",total);
/*    System.out.printf("%n%-10s %-10s %-10s","Teacher","Class","Period");
    System.out.printf("%n%-10s %-10s %-10s","luigui","history","6");
    System.out.printf("%n%-10s %-10s %-10s","hayes","comp sci","7");
    System.out.printf("%n%-10s %-10s %-10s","mcgrath","lit","8d");
    
    double price = 200.354;
    System.out.printf("%n%-10s%-10s","product","price");
    System.out.printf("%n%-10s$%,.2f","screen",price);
    System.out.printf("%n%-10s$%,.2f","bear",9.765);
 */   
    
/**/
}//end of main
}//end of class lincolin

/*
 * 
 A quote by Abraham Lincolin:
Whatever you are, be a good one.
 /*
  * A quote by Abraham Lincolin:
Whatever you are, be a good one.

  */




















