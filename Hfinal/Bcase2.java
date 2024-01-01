package Hfinal;

// final methods
class Bike
{  
  final void run(){System.out.println("running");}  
  void kaka(){System.out.println("kaka of parent ");}
}  
     
class Honda extends Bike
{  
   //void run(){System.out.println("running safely with 100kmph");}     //this gives an error 
   // final method cant be overriden  but can be inherited
    final void kaka()
    {
      System.out.println("kaka of child");// this wont give u any error dw
      this.run(); // see we can inherit the shit
   } 
}  

public class Bcase2 
{
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   honda.kaka();
   }  
    
}
 

// whats happening is when onject is created when it tries to acces the method first  it...