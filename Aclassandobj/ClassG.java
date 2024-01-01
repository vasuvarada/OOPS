package Aclassandobj;

class Sudent
{
    int id;
    String name;
    String city;


    Sudent(int x,String y,String z)
    {
        this.id=x;
        this.name=y;
        this.city=z;
    }

    Sudent(Sudent x)    // copying another object
    {
        this.id=x.id;
        this.name=x.name;
        this.city=x.city;
    }

    
}

public class ClassG 
{
    public static void main(String[] args)
    {
        Sudent x= new  Sudent(1,"vasuvarada","kakinada");
        Sudent y= new Sudent(x);
        Sudent z=x;  // even this works but this is not a new object it is same object as x stored in another refernce variable

        System.out.println(x.id +" "+x.name+ " "+x.city);
        System.out.println(y.id+" "+y.name+" "+y.city);
        System.out.println(z.id+" "+z.name+" "+z.city);

        
    }
    
}
