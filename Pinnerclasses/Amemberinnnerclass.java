package Pinnerclasses;

class Outer
{  
 private int data=30;
 void msg()
 {System.out.println("outer method");}  


 class Inner{  
  void msg(){System.out.println("innermethod");} 
  void data(){System.out.println(data);} 
 }  

}  

class memberinnerclass
{
public static void main(String args[]){  
  Outer out=new Outer();  
  Outer.Inner in=out.new Inner();  
  in.msg();   // innehitience when overriden just like subclass
  out.msg();
  in.data();
  //out.data();
 }  
}