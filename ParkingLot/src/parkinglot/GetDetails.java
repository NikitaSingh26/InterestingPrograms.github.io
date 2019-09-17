package parkinglot;
import java.util.*;

public class GetDetails 
{
 String name,mobileNum,carNum,carSize,ID;
 Scanner S=new Scanner(System.in);
 
 void setName()
 {
  System.out.println("Enter name: ");
  name=S.nextLine();
 }        
 void setMobile()
 {
  System.out.println("Enter mobile: ");
  mobileNum=S.nextLine();
 }        
 void setCarNum()
 {
  System.out.println("Enter Car Registration Number: ");
  carNum=S.nextLine();
 }   
 void setCarSize()
 {
  System.out.println("Enter Car Size (S/M/L): ");
  carSize=S.nextLine();
 } 
 String getName()
 {
   return name;  
 }
 String getMobile()
 {
   return mobileNum;  
 }
 String getCarNum()
 {
   return carNum;  
 }
 String getCarSize()
 {
   return carSize;  
 }
 
 void enterID()
 {
   System.out.println("Enter ID present in the parking slip: ");
   ID=S.nextLine();
 } 
 String getID()
 {
   return ID;
 }        

}
