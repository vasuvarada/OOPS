package Jinstanceof;

public class Acase1 
{
    public static void main(String args[])
    {  
 Dog1 d=new Dog1();  
 System.out.println(d instanceof Animal);//true  
 System.out.println(d instanceof Dog1);//true

 Animal a=new Dog1();
 System.out.println(a instanceof Animal);//true
 System.out.println(a instanceof Dog1);//true
     }
    
}


class Animal
{
}  

class Dog1 extends Animal
{//Dog inherits Animal   
}  