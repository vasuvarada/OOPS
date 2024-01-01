package Bstatic;

   class Kaka 
  {
        // Instance variable
        public int instanceVariable=4000;

        // Static variable
        public static int staticVariable=8000;
    
        // Instance method
        public void instanceMethod() {
            // Can access  and modify instance variables and static variables
            instanceVariable = 10;
            staticVariable = 20;
        }
    
        // Static method
        public static void staticMethod() {
            // Cannot access instance variables
            // Can access and modify  only static variables
            staticVariable = 30;
            
        }

    
  }
  
  // here the static method and varible both are outiside the   class where fileds defined to inorder to get them u should create the object  
  public class Bstaticmethodfromanotherclass {
    public static void main(String[] args) 
        {
            Kaka vasu=new Kaka();
             Kaka.staticMethod();  // accessed in static way 
            System.out.println(Kaka.staticVariable);

            Kaka.staticVariable=90;
            System.out.println(Kaka.staticVariable);

            System.out.println(vasu.instanceVariable);// instance variable called normally using object 
             

            


        }
      
    

  }
