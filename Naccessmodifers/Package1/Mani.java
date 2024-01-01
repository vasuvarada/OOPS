package Naccessmodifers.Package1;

public class Mani
{
    

    private void maniprivatemethod()
    {System.out.println("manimethod private is implemented");}

    public void manipublicmethod()      
    {System.out.println("manipublic method is implemented");}

    void manidefault()
    {System.out.println("mani default is implemented");}

    protected
     void maniprotectedmethod()
    {System.out.println("mani protected method implemented");}

    public static void main(String[] args) 
    {
        Mani m = new Mani();
        m.maniprivatemethod(); 
        m.manidefault(); 
        m.manipublicmethod();
    }
}


