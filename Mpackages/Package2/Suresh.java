package Mpackages.Package2;
// importing whatever class u want
import Mpackages.Package1.Mani;
import Mpackages.Package1.SubPackage1.Satya;


public class Suresh 
{
   public void sureshmethod()
   {System.out.println("suresh method implemented");}
   public static void main(String[] args) 
   {
      Mani m= new Mani();
      m.manimethod();
      m.Avrmethod();  // an extended class can be accessed without importing the extended class

      Satya s= new Satya();
      s.stayamethod();

      Mpackages.Package1.Vasu  v = new Mpackages.Package1.Vasu();  // accessing desired class using qualified name
      v.vasumethod();
      
   }
} 
