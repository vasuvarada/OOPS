package Kinterface.Case4;

public interface Animal 
{
    public abstract void animal();

    default void kaka()  // non abstract
    {
       System.out.println(" method from interface"); 
    }
    
    static void mawa() // non abstract
    {
        System.out.println("static method from interface");
    }
    
}
