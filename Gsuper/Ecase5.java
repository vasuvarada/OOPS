package Gsuper;



class Anima
{
   int id=900;
   String name;

   Anima(int x , String y)
   {
    this.id=x;
    this.name=y;
    System.out.println("constructor of animal haveing parms is invoked");
   }

   Anima()
   {
    System.out.println("constructr of animal without params is invoked");
   }

   public void  talking()
   {
    System.out.println("animals sound with their own type");
   }
}


class Do extends Anima
{
    int id=82;
    String subname;
  Do(int x,String y)
  {
    this.id=x;
    this.name=y;
    System.out.println("constructor of dog with 2 parms is invoked");
  }

  public void kaka()
  {
    System.out.println(id+" "+subname); // i can directly acces the parent class ka field outside the constructor without super keyword
  }

  public void  maka()
  {
    System.out.println(super.id+" "+name); // no need to use super for name cause no overwriding 
  }


}
public class Ecase5
{
    public static void main(String[] args) 
    {
          Do x = new Do(4, "PUPPY");  // THIS OUTPUT SHOWS THAT CONST OF PARENT WITHOUT ANY PARMS IS INVOKED
          x.kaka(); // this shows how the child varibale override the parent varibale
          x.maka();// and we use super keyword to get the parent variable
          //also when the variables have different names they would be no confustion

    }
    
}
