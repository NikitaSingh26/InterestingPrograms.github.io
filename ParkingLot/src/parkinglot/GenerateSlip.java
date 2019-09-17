package parkinglot;
import java.util.*;
import java.text.*;
import java.sql.*;

public class GenerateSlip
{
 String name,mobileNum,carNum,ID,carSize;
 int duration=0;
 GetDetails ob=new GetDetails();
 java.util.Date date; 
 String status;
 
 List a=new ArrayList();
 
 void data()
 {        
  ob.setName();
  ob.setMobile();
  ob.setCarNum();
  ob.setCarSize();
  name=ob.getName();
  mobileNum=ob.getMobile();
  carNum=ob.getCarNum();
  carSize=ob.getCarSize();
  
 }  
 
 String details()
 {
   ob.enterID();
   ID=ob.getID();
   return ID;
 } 

 String getOutTime()
 {
  date = new java.util.Date();   
  String outTime = new SimpleDateFormat("HH:mm:ss").format(date);
  return outTime;
 }        
 
 List slip1generate(String parkingLot,String ID)
 {
  date = new java.util.Date();   
  String inTime = new SimpleDateFormat("HH:mm:ss").format(date);   
  a.add(ID);
  a.add(mobileNum);
  a.add(inTime);
  status="Not Paid";
  a.add(status);
  
  System.out.println("\nMOBILE NUMBER: "+mobileNum+"\nIN-TIME: "+inTime+
                     "\nPARKING LOT: "+parkingLot+"\nID: "+ID);
  return a;
 } 
 
int getDuration(String inTime,String outTime)
{
 String[] entrytime =inTime.split ( ":" );
 int inhour = Integer.parseInt (entrytime[0].trim());
 int inmin = Integer.parseInt (entrytime[1].trim());
 
 String[] exittime =outTime.split ( ":" );
 int outhour = Integer.parseInt (exittime[0].trim());
 int outmin = Integer.parseInt (exittime[1].trim());

 duration=(outhour-inhour)*60+(outmin-inmin);
 return duration;
}        

void slip2generate(String ID,int price,String mobileNum,String inTime,
                                String outTime,int duration,String status)
{
 System.out.println("\n\nID: "+ID+"\nMOBILE NUMBER: "+mobileNum+"\nIN-TIME: "+inTime+
                   "\nOUT TIME: "+outTime+"\nDURATION: "+
                    duration+" minute(s)\nCOST: "+price);
 status="Paid";
 
 date = new java.util.Date();  
 String DateOfLeaving = new SimpleDateFormat("dd/MM/yy").format(date);

 try
 {
  Class.forName("com.mysql.jdbc.Driver");
  Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","1234");
  
Statement st=C.createStatement();
st.executeUpdate("INSERT INTO `ParkingLot`(ID,DateOfLeaving,Duration_minutes,AmountPaid,Status) VALUE('"
          +ID+"','"+DateOfLeaving+"','"+duration+"','"+price+"','"+status+"')");
  
  
  
      C.close();
 }
 catch(Exception ex)
 {
  System.out.println(ex);
 }    
  a.remove(ID);
  a.remove(mobileNum);
  a.remove(inTime);
  a.remove(status);
}

}