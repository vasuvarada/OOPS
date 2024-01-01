package Gsuper;


class Anial
{  
void eat(){System.out.println("eating...");}  
}  


 class Dg extends Anial
{  

  Dg()
  {
     super.eat();   // we can even do that inside the constructor 
  }
  void eat(){System.out.println("eating bread...");}   
  void bark(){System.out.println("barking...");}  
   void work()
  {  
    super.eat();   //super key word is used to access parent objects method
    this.bark();  
  }  

  static void mass()
  {
    //super.eat();
    //this.eat();

    // a static method is object independent and works having class as base sp this/super doesnt work with static methods/varaibles
  }
}  
public class Bcase2
{  
public static void main(String args[]){  
Dg d=new Dg();    
d.eat();  //method overloaded
d.work();  // avoiding method overloading method 

}}  

//The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden. 
