package tictactoe;
import java.util.*;

public class TicTacToe 
{
 public static void main(String[] args)
 {
  try
  {    
  int choice,flag;
  String sUser,sComp;
  String arr[][]=new String[3][3];
  Scanner S=new Scanner(System.in);
  Location ob=new Location();
  CrossesNoughts obj=new CrossesNoughts();
      
  System.out.println("Welcome to TIC-TAC-TOE \n");
  do
  {
   flag=0;
   for(int i=0;i<3;i++)
   {
    for(int j=0;j<3;j++)
    {
     arr[i][j]="-";
    }    
   }
   System.out.println("Choose from the following: \n1.START SINGLE PLAYER \n2.QUIT \n");
   choice=S.nextInt();
   switch(choice)
   {
       case 1:
       { 
         sUser=obj.userInput();
         sComp=obj.compInput();
          ob.printAll(arr);
          System.out.println("\nGAME STARTING..\nChoose your location..");
          while(flag==0)
         {
          ob.userLocate(arr,sUser);
          ob.compLocate(arr,sComp);
          ob.printAll(arr);
          flag=ob.winner(arr,sUser,sComp,flag);
         }
         if(flag!=0)
         {
          System.out.println("\nGAME OVER \n");
         }    
         break;
       }
       
       case 2: 
       {
           System.out.println("Quitting...");
           break;
       }
       
       default:
           break;
   }
  
  }
  while(choice!=2);
 
  }
  catch(Exception e)
  {
   System.out.println("\nInvalid data entered..RUN AGAIN..!! ");
  }
 }

}
