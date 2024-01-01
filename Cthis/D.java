package Cthis;

public class D {
      
  void m(D obj)
  {  
  System.out.println("method is invoked");  
  }  
  void p()
  {  
    this.m(this);  
  }  



  public static void main(String args[])
  {  
  D s1 = new D();  
  s1.p();  
  }  
}  


//The this keyword can also be passed as an argument in the method. It is mainly used in the event handling. Let's see the example: