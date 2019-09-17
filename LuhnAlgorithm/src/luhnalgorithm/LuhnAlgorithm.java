package luhnalgorithm;
import java.util.*;

public class LuhnAlgorithm 
{
 public static void main(String[] args)
 {
  try
  {
  Scanner S=new Scanner(System.in); 
  System.out.println("WELCOME TO CREDIT CARD VALIDATION MACHINE!!\n");
  
  UserInput ob=new UserInput();   
  String cardNum= null;
  
  cardNum=ob.cardInput(cardNum);
  int length=ob.getlength();
  ChkValidation obj=new ChkValidation();
  boolean valid;
  valid=obj.isValid(cardNum,length);
  if (valid==true)
  {
   System.out.println("Credit Card Number is valid \n");
  }
  else
  {
   System.out.println("Credit Card Number is not valid \n");   
  }
  }
  catch(Exception e)
  {
   System.out.println("Invalid data entered..try again..");
  }    
 }
    
}
