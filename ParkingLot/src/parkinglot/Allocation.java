package parkinglot;
import java.util.*;
import java.text.*;

public class Allocation
{
 String parkingLot,ID,location;
 int price;
 int firstFlVacency=1,secondFlVacency=1,thirdFlVacency=1,fourthFlVacency=1,fifthFlVacency=1,entries=0;
 int smallentries=0,mediumentries=0,largeentries=0;
 GenerateSlip obj=new GenerateSlip();
 Date date;
 
 String parkingLotAllocation(String carSize)
 {
  entries++;
 
    if(carSize.equals("S"))
    {
      smallentries++; 
      if(smallentries<=10)
      {
       parkingLot= "1st-FL-"+firstFlVacency+"-vacancy";
       location="A"+firstFlVacency;
       firstFlVacency++;
      }
      else if(smallentries<=20)
      {
       parkingLot= "2nd-FL-"+secondFlVacency+"-vacancy";
       location="B"+secondFlVacency;
       secondFlVacency++;
      }
      else if(smallentries<=30&&thirdFlVacency<=10)
      {
       parkingLot= "3rd-FL-"+thirdFlVacency+"-vacancy";
       location="C"+thirdFlVacency;
       thirdFlVacency++;
      }
      else if(smallentries<=40&&fourthFlVacency<=10)
      {
       parkingLot= "4th-FL-"+fourthFlVacency+"-vacancy";
       location="D"+fourthFlVacency;
       fourthFlVacency++;
      }
      else if(smallentries<=50&&fifthFlVacency<=10)
      {
       parkingLot= "5th-FL-"+fifthFlVacency+"-vacancy";
       location="E"+fifthFlVacency;
       fifthFlVacency++;
      }
      else
      {
       parkingLot=null; 
       location="00";
       System.out.println("\nPARKING LOT FULL..CANNOT PARK IN BASEMENT..!!");
      }  
     }
  
    else if(carSize.equals("M"))
    {
      mediumentries++; 
      if(mediumentries<=10&&thirdFlVacency<=10)
      {
       parkingLot= "3rd-FL-"+thirdFlVacency+"-vacancy";
       location="C"+thirdFlVacency;
       thirdFlVacency++;
      }
      else if(mediumentries<=20&&fourthFlVacency<=10)
      {
       parkingLot= "4th-FL-"+fourthFlVacency+"-vacancy";
       location="D"+fourthFlVacency;
       fourthFlVacency++;
      }
      else if(mediumentries<=30&&fifthFlVacency<=10)
      {
       parkingLot= "5th-FL-"+fifthFlVacency+"-vacancy";
       location="E"+fifthFlVacency;
       fifthFlVacency++;
      }
      else
      {
       parkingLot=null; 
       location="00";
       System.out.println("\nPARKING LOT FULL..CANNOT PARK IN BASEMENT..!!");
      }        
    }
 
    else if(carSize.equals("L"))
    {
      largeentries++; 
      if(largeentries<=10&&fourthFlVacency<=10)
      {
       parkingLot= "4th-FL-"+fourthFlVacency+"-vacancy";
       location="D"+fourthFlVacency;
       fourthFlVacency++;
      }
      else if(largeentries<=20&&fifthFlVacency<=10)
      {
       parkingLot= "5th-FL-"+fifthFlVacency+"-vacancy";
       location="E"+fifthFlVacency;
       fifthFlVacency++;
      }
      else
      {
       parkingLot=null;
       location="00";
       System.out.println("\nPARKING LOT FULL..CANNOT PARK IN BASEMENT..!!");
      }      
    }
  
    return parkingLot;
 }
 
 String parkingIDallocation(String carNum)
 {
   date = new Date();  
   String entryDate= new SimpleDateFormat("ddMMyy").format(date);
   ID=carNum+""+location+""+entryDate+"";
   return ID; 
 }      

 int costAllocation(int duration)
 {
   int hours =duration/60; 
   if(hours<=2)
       price=50;
   else if(hours<=9)
       price=50+(hours-2)*30;
   else if(hours>=9)
       price=50+7*30+(hours-9)*60;
  return price;   
 }

 
}

