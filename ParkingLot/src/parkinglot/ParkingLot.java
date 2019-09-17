package parkinglot;
import java.util.*;

public class ParkingLot 
{
 public static void main(String[] args)
 {
  try
  {    
  int choice,duration;
  int price;
  String parkingLot,ID,mobileNum,inTime,outTime,status;
  Scanner S=new Scanner(System.in);
  GenerateSlip obj=new GenerateSlip();
  Allocation object=new Allocation();
  do
  {
   System.out.println("\nWELCOME TO PARKING LOT MACHINE: ");
   System.out.println("1.PARK THE CAR\n2.TAKE CAR OUT \n3.QUIT PORTAL");
   choice=S.nextInt();
   switch(choice)
   {
     case 1:{    
               obj.data();
               parkingLot=object.parkingLotAllocation(obj.carSize);
               ID=object.parkingIDallocation(obj.carNum);
               obj.a=obj.slip1generate(parkingLot,ID);
               break;
            }   
     case 2:{
              ID=obj.details();
              int i=obj.a.indexOf(ID);
              mobileNum=(String)(obj.a.get(i+1));
              inTime=(String)(obj.a.get(i+2));
              status=(String)(obj.a.get(i+3));
              outTime=obj.getOutTime();
              duration=obj.getDuration(inTime,outTime);
              price=object.costAllocation(duration);
              obj.slip2generate(ID,price,mobileNum,inTime,outTime,duration,status);
              break;
            }
     
     case 3:{
             System.out.println("QUITTING..");
             break;
            }
     default:break;
   
   }
  }
  while(choice!=3);
  }
  catch(Exception e)
  {
   System.out.println("Invalid data entered.. "+e+" Run again");
  }
 }
}
