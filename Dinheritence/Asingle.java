package Dinheritence;

 class Animal // parent class
{
   
  Animal()
  {
    System.out.println("testing that parent class ka intance is created");
  }
   public void eat()
   {
     System.out.println("all animals  eat.....");
   } 
}

class Dog extends Animal // child class
{
    void bark()
    {
        System.out.println("dog obv barks it cant shout");
    }
}

public class Asingle 
{
   public static void main(String[] args) 
   {
    Dog d = new Dog();
    d.bark();
    d.eat();

    Animal a = new Animal();
    a.eat();         
    //a.bark();  //this cant be happend note it anyways 
   }    
}

// it clearly shows that the instance of parent class is also created to access this we need to use super keyword
// every parent and subparent also creates instances
