package luhnalgorithm;

public class ChkValidation
{
 int l,sum1=0,sum2=0,sum,num,onesDigit,tensDigit;   
 boolean isValid(String cardNum,int length)
 {
  l=length;
  int[] n=new int[20];
  
  for(int k=0;k<l;k++)
  {
      n[k]=(int)(cardNum.charAt(k))-48;
  }    
  
  for(int i=l-2;i>=0;i=i-2)   
  {
   if(n[i]<5)
   {
    sum1=sum1+n[i]*2;   
   }
   else
   {
    num=n[i]*2;
    onesDigit=num%10;
    tensDigit=num/10;
    sum1=sum1+onesDigit+tensDigit;
   }    
  }
  
  for(int j=l-1;j>=0;j=j-2)
  {
   sum2=sum2+n[j]; 
  }    
  
  sum=sum1+sum2;
  if(sum%10==0)
  {
   return true;
  }
  else
  {
   System.out.println("\nThe Checked digit in the end should be: "+sum%10+" \n");
   return false;   
  }
 } 
}
