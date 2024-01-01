  package Bstatic;

  public class Astaticmethod 
  {
        // Instance variable
         int instanceVariable=4000;

        // Static variable
         static int staticVariable=8000;
    
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
            //instanceVariable=88;//compliation error
            staticVariable = 30;
        }

        public static void main(String[] args)   // this is considered just as a static method
        {
            
          /*
             // a static variable can be accesed without creating object 
              System.out.println(staticVariable); 
          */
          

          /* 
          // a static variable can be modified  only in a static method static void main is static methi=od itself
            staticVariable=80;
            System.out.println(staticVariable);

          */

          /*
            //instance variables(in  static method )  cant be accesed without creating object
            System.out.println(instanceVariable); // compl
          */

        /*
          // accessing and can edit  the instance variable  with creating an object
          Astaticmethod vasu= new Astaticmethod();
          System.out.println(vasu.instanceVariable);
         */


       /*
        // instance method can modify the static variable 
         Astaticmethod vasu= new Astaticmethod();
          System.out.println(staticVariable);
          vasu.instanceMethod();
          System.out.println(vasu.instanceVariable);
          System.out.println(staticVariable);
       
        */

        /*
         //static method can access and modify only static variables
         staticMethod();
        System.out.println(staticVariable);

         */

        /*
          Astaticmethod vasu = new Astaticmethod();
         System.out.println(vasu.instanceVariable);
         System.out.println(staticVariable);
         vasu.instanceMethod();
         System.out.println(vasu.instanceVariable); 
         System.out.println(staticVariable);

         Astaticmethod kaka = new Astaticmethod();
         System.out.println((kaka.instanceVariable));
         System.out.println(staticVariable);
         
// instance variable is gets its new value that is 4000 becoause its an new instance here but static value  retains its manipulated value
         */
          
        }
      
  }
