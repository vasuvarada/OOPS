package Kinterface.Case2;
// inmplementing two interfaces at a time
public class Case2 implements Printable,Showable
{
    public  void print() 
    {
      System.out.println("common method printed");
    }

    public void printmethod()
    {
        System.out.println("printmethod invoked");
    }

    public void showablemethod()
    {
        System.out.println("showablemethod invoked");
    }
    
    public static void main(String args[])
    {
             Case2 obj = new Case2();
             obj.print();
             obj.showablemethod();
             obj.printmethod();
             System.out.println(Printable.print);
             System.out.println(Showable.show);
            
    }
}


// in case of inheritance we may get ambiquity beacuse 
// 1. conisder prinatble and showable as classes then when case2 class is extended if the print method is not overriden by the child class( case2) what will it print ?
//2. incase of interface it was rule to implement all the methods of interface hence we wont face any ambiquity
