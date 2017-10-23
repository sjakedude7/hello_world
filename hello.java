// a simple program to practice common Github commands 
import java.util.Scanner;

public class hello {

    public static void main(String [] args) {


	// added  line	

        System.out.println("Hello Class!");

        Scanner scnr = new Scanner(System.in);

        String name = scnr.next();
        
        System.out.println("Hello " + name + ", my name is Alice");
    }
}

