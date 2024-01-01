package Naccessmodifers.Package1.SubPackage1;

import Naccessmodifers.Package1.Mani;

//import Naccessmodifers.Package1.Vasu;   // cant be accessed form parent package its access level is  package but it cant be accesed 

class Satya 
{
    

     public static void main(String[] args) 
     {
          /*
             Vasu v1= new Vasu();
             v1.vasumethod();
           */

           Mani m = new Mani();// child pckage can access the public class
          // m.maniprivatemethod(); - failed at method level since its only upto thet class
           // m.manidefault();  - fialed at method lebel since its only upto packgae level 
           m.manipublicmethod();


     }


}
