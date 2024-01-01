package Gsuper;


class Animal
{  
Animal()
{System.out.println("animal is created");}     // parent class
}  


class Dog extends Animal
{  
Dog()
{  
     super();    //also it should be the first statement like this
                 //access the instance constructor of parent class
    System.out.println("dog is created");      // child class or subclass
}  
}  


class Cat extends Animal
{
    Cat()
    {
        System.out.println("cat is created");
        //when u create the instance of cat compiler automatically creates the instace of animal also means its provides defaultly super()
    }

   // super();  // a constructor is used to construct the instance (object) meantiong here doesnt mean anything
}
public class Acase1 extends Object{  
public static void main(String args[])
{  
    
  Dog d=new Dog();
//super();     //we cant use super here 

  Cat c= new Cat();  
// open this and check
// this shows how default super() constrcutor works we havent provided any super keyword in cat class it posses it by default

}
}  

