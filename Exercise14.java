/*
/*Eugene Vasquez
Exercise 14
COSC/ITSE
print vowels/non in a given statement from user
*/
import java.util.Scanner;

	 
public class Exercise14 {

public static void main(String[] args) {
 
 Scanner objInput = new Scanner(System.in);

    
    String strInput="";
    int intACounter = 0;
    int intECounter = 0;
    int intICounter = 0;
    int intOCounter = 0; 
    int intUCounter = 0; 

    int intIndex=0;

	System.out.println("Enter a word so I can tell you the vowels! ");
       strInput = objInput.next();

     while (intIndex < strInput.length()){

        switch (strInput.charAt(intIndex)) { 

	      case 'a':
	         intACounter++;
	        break;

	      case 'e':
	         intECounter++;
	        break;

	      case 'i':
	         intICounter++;
	        break;

	      case 'o':
	         intOCounter++;
	        break;

	      case 'u':
	         intUCounter++;
	        break;

	 

	    }
        intIndex++;
     }
        System.out.println("a: " + intACounter);
        System.out.println("e: " + intECounter);
        System.out.println("i: " + intICounter);
        System.out.println("o: " + intOCounter);
        System.out.println("u: " + intUCounter);
    

	  }

	}
