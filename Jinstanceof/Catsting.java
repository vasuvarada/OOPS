package Jinstanceof;


class  Anima
{
    int x=5000;
    int same =7000;
    void kaka()
    {System.out.println("kaka of animal");}
    void mawa()
    {System.out.println("seperate method of animal");}
    
}

class Dog2 extends Anima
{  
    int y=4000;
    int same=6000;
    void kaka()
    {System.out.println("kaka of dog");}
    void bro()
    {System.out.println("seperate method of dog");}
}  
public class Catsting
{
    public static void main(String args[])
    {  
      // Dog2 d=new Anima();// this will give u compilation error
      //you perform it by typecasting, ClassCastException is thrown at runtime.

      //Dog2 d=(Dog2)new Anima();  
     //Compiles successfully but ClassCastException is thrown at runtime  

      Anima a= new Dog2();
      Dog2 d2=(Dog2)a;
      // this is called perfect downcasting
      d2.kaka();
      d2.mawa();
      d2.bro();
      System.out.println(d2.x);
      System.out.println(d2.y);
      System.out.println(d2.same);

    }  
    
}
