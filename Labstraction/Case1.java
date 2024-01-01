package Labstraction;

abstract class Shape
{  
   int x=800;
   Shape()
   {
    System.out.println("testing abstract class constructor");
   }

   abstract void draw(); 
   
   //abstract void kaka(){System.out.println(" loll");} //  cop err -abstract methods should noy have impls in abstract class itself

   void kaka()
   {System.out.println(" abstract class and non abstract method invoked");}

   public static void main(String[] args) {
      //Shape s = new Shape();  // we can see that abstarct class cant be insistialized on its own 
   }
}  


class Rectangle extends Shape
{  
   void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape
{  
   void draw(){System.out.println("drawing circle");}  
}  

//class Ovel extends Shape{void test(){System.out.println(" this wont work");}}
//com error - when a class is extend by astract class it must inhert its abstract methods



class Case1
{  
public static void main(String args[])
{ 
    Rectangle r = new Rectangle();
    r.draw();
    r.kaka();
    System.out.println(r.x);// varibales are not static by default
    r.x=874;
    System.out.println(r.x); // varibales are not final  by defauult

    Shape s=new Circle1(); // abstract class can be insistalized as refernce vairable
    s.draw(); 
    r.kaka(); 

   // Shape  s1= new Shape(); // we can see that abstarct class cant be insistialized on its own 
      
    
}  
}  