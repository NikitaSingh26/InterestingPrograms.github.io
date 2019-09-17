package calculator1;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.text.*;

public class Calculator implements ActionListener
{
    JFrame JF;
    JLabel JL;
    JLabel JLop;
    JTextField JTF;
    JButton JB0;
    JButton JB1;
    JButton JB2;
    JButton JB3;
    JButton JB4;
    JButton JB5;
    JButton JB6;
    JButton JB7;
    JButton JB8;
    JButton JB9;
    JButton JBclear;
    JButton JBadd;
    JButton JBsub;
    JButton JBprod;
    JButton JBdivide;
    JButton JBmod;
    JButton JBeven;
    JButton JBprime;
    JButton JBequal;
    JButton JBon;
    JButton JBoff;
    JButton JBdecimal;
    JButton JBperc;
    JButton JBback;
    
    static double num1=0,num2=0,num=0;
    int operator=0,length=0,check=0;
    String result,s;
    
 public Calculator()
 {
   JF=new JFrame("CALCULATOR");
   JF.setSize(1000,1000);
   JL=new JLabel("MY CALCULATOR");
   JTF=new JTextField("",9);
   JLop=new JLabel(" ");
   JLop.setBounds(5,120,15,30);
   JL.setBounds(10,10,200,40);
   JTF.setBounds(15,60,440,100);
 
   JB0=new JButton("0");
   JB1=new JButton("1");
   JB2=new JButton("2");
   JB3=new JButton("3");
   JB4=new JButton("4");
   JB5=new JButton("5");
   JB6=new JButton("6");
   JB7=new JButton("7");
   JB8=new JButton("8");
   JB9=new JButton("9");
   JBclear=new JButton("AC");
   JBadd=new JButton("+");
   JBsub=new JButton("-");
   JBprod=new JButton("x");
   JBdivide=new JButton("/");
   JBmod=new JButton("Mod");
   JBeven=new JButton("IsEven");
   JBprime=new JButton("Prime");
   JBequal=new JButton("=");
   JBon=new JButton("ON");
   JBoff=new JButton("OFF");
   JBdecimal=new JButton(".");
   JBperc=new JButton("%");
   JBback=new JButton("<--");
   
   JB0.setBounds(20,500,50,70);
   JB1.setBounds(20,400,50,70);
   JB2.setBounds(80,400,50,70);
   JB3.setBounds(140,400,50,70);
   JB4.setBounds(20,300,50,70);
   JB5.setBounds(80,300,50,70);
   JB6.setBounds(140,300,50,70);
   JB7.setBounds(20,200,50,70);
   JB8.setBounds(80,200,50,70);
   JB9.setBounds(140,200,50,70);
   JBdecimal.setBounds(80,500,50,70);
   JBequal.setBounds(140,500,118,70);
   JBadd.setBounds(208,200,50,70);
   JBsub.setBounds(208,290,50,50);
   JBprod.setBounds(208,360,50,50);
   JBdivide.setBounds(208,430,50,50);
   JBback.setBounds(275,200,80,70);
   JBeven.setBounds(275,300,80,70);
   JBprime.setBounds(275,400,80,70);
   JBon.setBounds(275,500,80,70);
   JBclear.setBounds(380,200,70,70);
   JBmod.setBounds(380,300,70,70);
   JBperc.setBounds(380,400,70,70);
   JBoff.setBounds(380,500,70,70);
   
   JF.add(JTF);
   JF.add(JL);
   JF.add(JB0);
   JF.add(JB1);
   JF.add(JB2);
   JF.add(JB3);
   JF.add(JB4);
   JF.add(JB5);
   JF.add(JB6);
   JF.add(JB7);
   JF.add(JB8);
   JF.add(JB9);
   JF.add(JBclear);
   JF.add(JBadd);
   JF.add(JBsub);
   JF.add(JBprod);
   JF.add(JBdivide);
   JF.add(JBmod);
   JF.add(JBeven);
   JF.add(JBprime);
   JF.add(JBequal);
   JF.add(JBon);
   JF.add(JBoff);
   JF.add(JBdecimal);
   JF.add(JBperc);
   JF.add(JBback);
   JF.add(JLop);
   JF.setLayout(null);
   JF.setVisible(true);
   
   JB0.addActionListener(this);
   JB1.addActionListener(this);
   JB2.addActionListener(this);
   JB3.addActionListener(this);
   JB4.addActionListener(this);
   JB5.addActionListener(this);
   JB6.addActionListener(this);
   JB7.addActionListener(this);
   JB8.addActionListener(this);
   JB9.addActionListener(this);
   JBadd.addActionListener(this);
   JBsub.addActionListener(this);
   JBprod.addActionListener(this);
   JBdivide.addActionListener(this);
   JBmod.addActionListener(this);
   JBeven.addActionListener(this);
   JBprime.addActionListener(this);
   JBperc.addActionListener(this);
   JBclear.addActionListener(this);
   JBoff.addActionListener(this);
   JBon.addActionListener(this);
   JBback.addActionListener(this);
   JBequal.addActionListener(this);
   JBdecimal.addActionListener(this);
   
   //JTF.setDocument(new JTextFieldLimit(9));

 }        
  
 
 public void actionPerformed(ActionEvent e)
 {
  try
  {    
  if(e.getSource()==JB0)   
  {JTF.setText(JTF.getText().concat("0")); check=0;}
  if(e.getSource()==JB1)   
  {JTF.setText(JTF.getText().concat("1")); check=0;}
  if(e.getSource()==JB2)   
  {JTF.setText(JTF.getText().concat("2")); check=0;}
  if(e.getSource()==JB3)   
  {JTF.setText(JTF.getText().concat("3")); check=0;}
  if(e.getSource()==JB4)   
  {JTF.setText(JTF.getText().concat("4")); check=0;}
  if(e.getSource()==JB5)   
  {JTF.setText(JTF.getText().concat("5")); check=0;}
  if(e.getSource()==JB6)   
  {JTF.setText(JTF.getText().concat("6")); check=0;}
  if(e.getSource()==JB7)   
  {JTF.setText(JTF.getText().concat("7")); check=0;}
  if(e.getSource()==JB8)   
  {JTF.setText(JTF.getText().concat("8")); check=0;}
  if(e.getSource()==JB9)   
  {JTF.setText(JTF.getText().concat("9")); check=0;}
  if(e.getSource()==JBdecimal)   
  {JTF.setText(JTF.getText().concat(".")); check=0;}
 
  if(e.getSource()==JBadd)   
  {
      num1=Double.parseDouble(JTF.getText());
      operator=1;
      JTF.setText("");
      JLop.setText("+");
  }
  
  if(e.getSource()==JBsub)   
  {
      num1=Double.parseDouble(JTF.getText());
      operator=2;
      JTF.setText("");
      JLop.setText("-");
  }
  
  if(e.getSource()==JBprod)   
  {
      num1=Double.parseDouble(JTF.getText());
      operator=3;
      JTF.setText("");
      JLop.setText("x");
  }
  
  if(e.getSource()==JBdivide)   
  {
      num1=Double.parseDouble(JTF.getText());
      operator=4;
      JTF.setText("");
      JLop.setText("/");
  }
  
  if(e.getSource()==JBmod)   
  {
      num1=Double.parseDouble(JTF.getText());
      operator=5;
      JTF.setText("");
      JLop.setText("%");
  }
  
  if(e.getSource()==JBequal)   
  {
      JLop.setText("");
      num2=Double.parseDouble(JTF.getText());
      switch(operator)
      {
       case 1: {
                 num=num1+num2;
                 break;
               }
       case 2: {
                 num=num1-num2;
                 break;
               }
       case 3: {
                 num=num1*num2;
                 break;
               }
       case 4: {
                 num=num1/num2;
                 break;
               }
       case 5: {
                 num=num1%num2;
                 break;
               }
       default:{
                 JTF.setText("");
                 break;
               }
      }    
      result=String.valueOf(num);
      JTF.setText(result);
      check=1;
  }
  
  if(e.getSource()==JBoff) 
   JTF.setVisible(false);
  
  if(e.getSource()==JBon) 
  {
    JTF.setVisible(true);
    JTF.setText("");
  }
   
  if(e.getSource()==JBclear)
    JTF.setText("");
   
  if(e.getSource()==JBperc) 
  {
    check=1;
    String str=JTF.getText();
    int n=Integer.parseInt(str);
    float perc=(float)(n*0.01);
    String str1=String.valueOf(perc);
    JTF.setText(str1);
  }
  
  if(e.getSource()==JBeven) 
  {
    check=1;
    String str=JTF.getText();
    int n1=Integer.parseInt(str);
    if(n1%2==0)
     JTF.setText("It is even!");
    else
     JTF.setText("It is odd!");
  }
  
  if(e.getSource()==JBprime) 
  {
    check=1;
    String str=JTF.getText();
    int n1=Integer.parseInt(str);
    int n=n1/2,i=2,check=0;
    if(n1==1)
    JTF.setText("Neither prime nor composite");    
    while(i<=n && n1>1)
    {
     if (n1%i==0)
     {
      check=1;
      break;
     }
     else
      i++;    
    }
   if(n1!=1) 
    if (check==0)
     JTF.setText("It is prime!");
    else
     JTF.setText("It is not prime!");
  }
  
  if(e.getSource()==JBback) 
  {
    s=JTF.getText();
    length=s.length();
    String S="";
    String letter;
    for(int i=0;i<length-1;i++)
    {
        letter=String.valueOf(s.charAt(i));
        S=S.concat(letter);
    }
    if (check!=1)
    JTF.setText(S);
  }
 }
 catch(Exception ex)
 {
  System.out.println("Invalid data entered.. "+ex);
 }    
}
 
 public static void main(String[] args)
 {
  try{
      new Calculator();
  }  catch(Exception e)
  {
     System.out.println(e);
  }
 }
    
}

/*class JTextFieldLimit extends PlainDocument
{
  private int limit;
  JTextFieldLimit(int limit) 
  {
    super();
    this.limit = limit;
  }
  
  public void insertString(int offset, String str, AttributeSet a) throws BadLocationException
  {
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) 
      super.insertString(offset, str, a);
  }
}*/