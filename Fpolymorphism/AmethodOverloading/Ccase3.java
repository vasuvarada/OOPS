package Fpolymorphism.AmethodOverloading;


class Bike
{  
 int speedlimit=90;  
}  
class Honda3 extends Bike
{  
 int speedlimit=150;  
}

public class Ccase3 
{
    public static void main(String args[]){  
    Honda3 obj=new Honda3();      
    System.out.println(obj.speedlimit);//90  
 } 
    
}

  
// here its not method overwriting the parent class is runned first follwod by the child class so the variable is updated
 
