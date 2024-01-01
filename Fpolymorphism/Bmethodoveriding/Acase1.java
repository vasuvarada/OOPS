package Fpolymorphism.Bmethodoveriding;

 //Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class Bank{  
  int x=2000;
int getRateOfInterest()
{return 0;}  

static void kaka()
{
    System.out.println("parent class static method");
}

}  



//Creating child classes.  
class SBI extends Bank{  
  int x=5000;  // lets see if it overides variables also...
int getRateOfInterest(){return 8;} 
static void kaka()
{
    System.out.println("child class static method");
}

}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  

class Acase1

{  
public static void main(String args[])
{  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  

  //static method should be called in static way  you can do this for the class u want it doesnt depend on the object anyways
  SBI.kaka();
  Bank.kaka();

  System.out.println(s.x);  // this is the object of child class even the refrence variable is also of child class so it cant be overiden 

}  
}  

// here object accessor (refernce variable) and object intizaler both are of child class so they will have the acces for both parent and child
