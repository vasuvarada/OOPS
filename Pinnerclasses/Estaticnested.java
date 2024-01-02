package Pinnerclasses;

class Estaticnested{  
  static int data=30; 

  static class Inner
  {  
   void msg(){System.out.println("data is "+data);}  
   static void kaka(){System.out.println("denki obj tho pan le");}
  }  
  public static void main(String args[]){  
  Estaticnested.Inner obj=new Estaticnested.Inner();  
  obj.msg();  
  Estaticnested.Inner.kaka(); 
  }  
}  