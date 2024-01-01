package Naccessmodifers.Package1;

// import Naccessmodifers.Package1.SubPackage1.Satya; // cant access child package data with package level avaialbilty

// method and filed can be private
class Vasu   // no AM is mentioned means its deafult(package available) so this class is available onlyy inside this package
{
   // priavte Vasu() {}  // constructor cant have access modifers it has same as parents
    
    private int vasufeild=100;

    private void vasuprivatemethod()
    {System.out.println("vasumethod private is implemented");}

    public void vasupublicmethod()      
    {System.out.println("vasupublic method is implemented");}

    void vasudefault()
    {System.out.println("vasu default is implemented");}
    public static void main(String[] args) 
    {
      Vasu v= new Vasu();
      System.out.println(v.vasufeild);  
      v.vasuprivatemethod();
    }
}

class testprivate_ams
{
     public static void main(String[] args)
      {
      Vasu v1= new Vasu();
      //v1.vasuprivatemethod(); // method is private 
      v1.vasupublicmethod(); // clears class level - default means avaialble for all classes inside package and then also clears method level its public
      v1.vasudefault();// this also clears both 

      Mani m = new Mani();
           //m.maniprivatemethod(); //- failed at method level since its only upto thet class
           m.manidefault(); 
           m.manipublicmethod();
      }

}