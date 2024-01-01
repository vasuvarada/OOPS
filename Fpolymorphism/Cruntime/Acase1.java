package Fpolymorphism.Cruntime;

class Animal {

    int x = 2000;
     Animal()
    {
        System.out.println("constructor with no parms is invoked");
    }
    Animal(Animal x)
    {
        System.out.println("constructor with object as input is invoked");
    }
    public void kaka() {
        System.out.println("vasuvarada");
    }
    public void mawa()
    {
        System.out.println("mawa method is invoked");
    }
}

 class Dog extends Animal {
    
    int x=5000;
    public void method()
    {
       
        System.out.println("chodho");
    }


    public void kaka()
    {
        System.out.println(" this is accesable because it method overdiding ");
    }

    Dog() 
    {   
        
        //super(); // Not necessary, the compiler adds a default super() if not present
        // super.kaka(); // This   will kaka() of parent class
        // System.out.println("so constructor  of test class is invoking ");  // this is printed beacuse constructor of child class is invokked
        System.out.println("dog constructor is also invoked");
        
        
    }

}

public class Acase1
{

    
    public static void main(String[] args) {
        Animal a2 = new Dog();    
        //upcasting the object of subclass to higher class
        //so bascially its considered as an object of class Animal but can have access to constructor of its child class and methods overriden by the child class that of parent class
       // This line creates an object of type Dog but is referenced by a variable of type Animal


      //a2.method(); // This line won't compile because method() is not in Animal class , so it cant access
          // You can do this instead: // you will learn more about this is  instanceofOperator
       /*
         if (a2 instanceof Test) {
            Test t = (Test) a2;     //downcasting it to  object of subclass
            t.method(); // Now it's okay because you've casted a2 to Test
        }

        */


          a2.kaka();    //this will print child class ka method because of method overriding
          a2.mawa();    // direct parent class method can be called

          System.out.println(a2.x);    // since its the refrence varibale of animal class it has the access of its parent class variables it doesnt have access to child class  
    
    }

    
}
