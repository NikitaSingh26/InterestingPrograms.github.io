package tictactoe;
import java.util.*;

public class CrossesNoughts 
{
    private String sUser,sComp;
    String userInput()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Choose CROSSES(X,x) or NOUGHTS(O,o,0) ??");
         sUser=S.nextLine();
         if(sUser.equals("X")||sUser.equals("x"))
         {
             System.out.println("\nYou've chosen: "+sUser);
             sComp="O";
             System.out.println("Computer is playing using: "+sComp+"\n");
             return sUser;
         }
         else if(sUser.equals("O")||sUser.equals("o")||sUser.equals("0"))
         {
             System.out.println("You've chosen: "+sUser+"\n");
             sComp="X";
             System.out.println("Computer is playing using: "+sComp+"\n");
             return sUser;
         }
         else
         {
             System.out.println("Invalid data entered: \n");
             return "-1";
         }   
    }   
    
    String compInput()
    {
        return sComp;
    }       
}
