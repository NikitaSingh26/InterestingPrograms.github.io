package luhnalgorithm;
import java.util.*;

public class UserInput
{ int length=0;   
 String cardInput(String cardNum)
 {
 
  Scanner S=new Scanner(System.in);
  System.out.println("Enter your card number: ");
  cardNum=S.nextLine();
  length=cardNum.length();
  
 System.out.println("\nChecking it's validity now...\n");
 
 return cardNum; 
}
 int getlength()
 {
     return length;
 }        
}
