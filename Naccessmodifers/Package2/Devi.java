package Naccessmodifers.Package2;

import Naccessmodifers.Package1.*;;

 class Devi extends Mani
{
  public static void main(String[] args) {
    Mani m = new Mani();
       //m.maniprivatemethod(); //- failed at method level since its only upto thet class
       //m.manidefault();  //- fialed at method lebel since its only upto packgae level 
       m.manipublicmethod();
      // m.maniprotectedmethod();  // comp error


    Devi d = new Devi();
       //d.maniprivatemethod(); //- failed at method level since its only upto thet class
       //m.manidefault();  //- fialed at method lebel since its only upto packgae level 
       d.manipublicmethod();
       d.maniprotectedmethod();
      

  }
    
}
