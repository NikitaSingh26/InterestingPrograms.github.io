package tictactoe;
import java.util.*;

public class Location 
{  
    private int row,col,r,c,count1=0,count2=0; 
    int [] rU=new int[9];
    int [] cU=new int[9];
    int [] rC=new int[9];
    int [] cC=new int[9];
   
    Scanner S=new Scanner(System.in);
    void printAll(String arr[][])
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        { 
          System.out.print("["+i+"]"+"["+j+"]"+" = "+arr[i][j]+" ");
        }  
        System.out.println("\n");
      }    
    }
    
    void userLocate(String [][] arr,String sUser)
    {    
      System.out.println("\nEnter ROW from 0,1,2");
      row=S.nextInt();
      System.out.println("Enter COLUMN from 0,1,2");
      col=S.nextInt();
      arr[row][col]=sUser;
      
      rU[count1]=row;
      cU[count1]=col;
      count1++;
    }
    
    void compLocate(String [][] arr,String sComp)
    {
     do
     {
      r=(int)(Math.random()*3);
      c=(int)(Math.random()*3);
     
     rC[count2]=r;
     cC[count2]=c;
     }
     while((r==rU[0]&&c==cU[0])||(r==rU[1]&&c==cU[1])||(r==rU[2]&&c==cU[2])||
           (r==rU[3]&&c==cU[3])||(r==rU[4]&&c==cU[4])||(r==rU[5]&&c==cU[5]));
     
     arr[r][c]=sComp;
     
     count2++;
    }
 
    int winner(String [][] arr,String sUser,String sComp,int flag)
    {
        if(((arr[0][0]==sUser)&&(arr[0][1]==sUser)&&(arr[0][2]==sUser))||
         ((arr[1][0]==sUser)&&(arr[1][1]==sUser)&&(arr[1][2]==sUser))||
         ((arr[2][0]==sUser)&&(arr[2][1]==sUser)&&(arr[2][2]==sUser))||
         ((arr[0][0]==sUser)&&(arr[1][0]==sUser)&&(arr[2][0]==sUser))||
         ((arr[0][1]==sUser)&&(arr[1][1]==sUser)&&(arr[2][1]==sUser))||
         ((arr[0][2]==sUser)&&(arr[1][2]==sUser)&&(arr[2][2]==sUser))||
         ((arr[0][0]==sUser)&&(arr[1][1]==sUser)&&(arr[2][2]==sUser))||
         ((arr[0][2]==sUser)&&(arr[1][1]==sUser)&&(arr[2][0]==sUser)))           
                 
        {
          System.out.println("\nYOU HAVE WON ");
          flag=1;
          return flag;
        }
        else if(((arr[0][0]==sComp)&&(arr[0][1]==sComp)&&(arr[0][2]==sComp))||
         ((arr[1][0]==sComp)&&(arr[1][1]==sComp)&&(arr[1][2]==sComp))||
         ((arr[2][0]==sComp)&&(arr[2][1]==sComp)&&(arr[2][2]==sComp))||
         ((arr[0][0]==sComp)&&(arr[1][0]==sComp)&&(arr[2][0]==sComp))||
         ((arr[0][1]==sComp)&&(arr[1][1]==sComp)&&(arr[2][1]==sComp))||
         ((arr[0][2]==sComp)&&(arr[1][2]==sComp)&&(arr[2][2]==sComp))||
         ((arr[0][0]==sComp)&&(arr[1][1]==sComp)&&(arr[2][2]==sComp))||
         ((arr[0][2]==sComp)&&(arr[1][1]==sComp)&&(arr[2][0]==sComp)))
                      
         {
          System.out.println("\nYOU HAVE LOST ");
          flag=1;
          return flag;
         }
         
        else
        return flag=0;    
    }
}
