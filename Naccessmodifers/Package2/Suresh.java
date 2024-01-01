package Naccessmodifers.Package2;

import Naccessmodifers.Package1.*;


 class Suresh 
{
  

   public static void main(String[] args) {
       // Vasu v= new Vasu();  // since vasu class is in default AM it can be accesable only upto package level
       // since it failed to access at class level it cant access the inside data also

       
           Mani m = new Mani();// child pckage can access the public class
        
           
   }
   
} 
