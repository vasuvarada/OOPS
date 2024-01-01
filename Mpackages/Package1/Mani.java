package Mpackages.Package1;

 class Avr
{
    public void Avrmethod()  // this must be public to make it available at durga class
    {System.out.println("lets test whether its assesable or not ");}
}

public class Mani  extends Avr
{
     public void manimethod()
     {System.out.println("mani method");}
}

