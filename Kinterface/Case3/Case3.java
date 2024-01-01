package Kinterface.Case3;

public class Case3 implements Showable 
{
    public void showable()
    {
        System.out.println("showable is implmented");
    }

    public void common()
    {
        System.out.println("common method is implemented");
    }
    
    public void prinatble()
    {
        System.out.println("printable method is implemented");
    }

    // when the class is implemented by a interface which is extended from another we have to implement all the methods of both


    public static void main(String[] args) 
    {
        Case3 obj1= new Case3();  // child class obj refered to itself
        obj1.showable();
        obj1.common();
        obj1.prinatble();

        Printable obj2= new Case3(); //child class obj reffered to parent class(runtime)
        obj2.common();
        //obj2.showable(); // as expected com err
        obj2.prinatble();
    }
}
