package Mpackages.Package2;
// importing all classes and interfaces from the package u desired excepting the subpackages
import Mpackages.Package1.*; // makes all classes which are public visible

 class Durga implements Jemmi  // interfaces are also accesable with *
{
    public static void main(String[] args)
    {
       Vasu v = new Vasu(); // you have to use import statement if the class is out of the package even if its public class
       v.vasumethod();

       Suresh s= new Suresh(); // this can be accessed without import statement becauses its public method
       s.sureshmethod();

       //Satya s= new Satya();  // compliation error because its in subpackage
         
    }
}
