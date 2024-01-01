package Hfinal;


final class Bike2{}  
  
class Honda1 //extends Bike  // this shows that final classes cant be inheited buss
{  
  void run(){System.out.println("running safely with 100kmph");}  

}  
public class Ccase3 {
      public static void main(String args[]){  
  Honda1 honda= new Honda1();  
  honda.run(); 
      }
    
}
