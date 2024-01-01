package IJavaBlocks;

class A{  
A()
{  
System.out.println("parent class constructor invoked");  
} 

{
  System.out.println(" parent intializer invoked");
}
}  
class B2 extends A{  
B2()
{  
super();  
System.out.println("child class constructor invoked");  
}  
  
{System.out.println("instance initializer block is invoked");}  
  

}  
public  class Bcase2
{
   public static void main(String args[]){  
    B2 b1=new B2();  
    
    }  
}


/*
 In the above example, it seems that instance initializer block is firstly invoked
  but NO. Instance intializer block is invoked at the time of object creation. 
  The java compiler copies the instance initializer block in the constructor after the first statement super().
   So firstly, constructor is invoked.
 */