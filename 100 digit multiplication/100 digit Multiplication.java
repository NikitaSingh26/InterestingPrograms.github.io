import java.util.Scanner;

public class Multiply
{
	public static void main(String[] args) 
	 {
	   String num1;
	   String num2;
	   
	   Scanner s=new Scanner(System.in);
	   
	   System.out.print("Enter first number: ");
	   num1=s.next();
	   
	   System.out.print("Enter second number: ");
	   num2=s.next();
	   
	   String result="";
	   int a,b,prod,rem=0,cnt=0;
	   String []r1 = new String[num2.length()]; 
	   String []rr = new String[num2.length()];
	   
	 for (int i = num2.length()-1 ; i >= 0 ; i--)
	 {
		 r1[cnt]="";
		 rr[cnt]="";
		 
	   for (int j = num1.length()-1; j >= 0; j--) 
	   {
		 a=(int)(num1.charAt(j))-48;
		 b=(int)(num2.charAt(i))-48;
		 
		 prod=b*a+rem;
		 
		 r1[cnt]=r1[cnt]+prod%10;
		   
		 if(prod>=10)
		 {
			rem=(prod/10); 
		 }
		 else
		 {
			 rem=0;
		 }
       }

	   for (int k = r1[cnt].length() - 1 ; k >= 0; k--) 
	   {  
		 rr[cnt]=rr[cnt]+r1[cnt].charAt(k);
	   }
	   if(cnt!=0)
	   {
		for(int n=0 ; n<cnt ; n++)
		 {
			rr[cnt]=rr[cnt]+"0";  
		 }
	   }
	   cnt++;
	 }
	 
	int []len = new int[rr.length];
	int sum , n1 , max=0;
	int carryover=0;
	
	for (int i = 0; i < len.length; i++) 
	{
		len[i]=rr[i].length();
		max++;
	}
	 
	String res="" , answer="" ;
	
	for(int n=0; n < len[max-1] ; n++)
	{
	  sum=0;	
	for (int i = 0; i < rr.length; i++)
	{
		if(rr[i].length() -1 >= n)
		{
		n1 =(int)(rr[i].charAt(len[i]-1-n))-48;
		sum=sum+n1+carryover;
		
		if( sum >= 10)
		{
			carryover= sum/10;
		}
		else
		{
			carryover=0;
		}
		}
	} 
	res=res+sum%10;
	}
	
	if(carryover != 0)
	{
		res=res+carryover;
	}
	 
	 for (int i = res.length() - 1 ; i >= 0; i--)
	 {
		answer=answer+res.charAt(i);
	 }
	 
	 
	 System.out.println("Product: \n"+answer);
	 
	 }
}