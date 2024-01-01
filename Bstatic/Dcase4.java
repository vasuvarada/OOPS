package Bstatic;

class Test
{
    int id;
    static String name;
    Test(int x,String y)
    {
        this.id=x;
        Test.name=y;
    }

}

public class Dcase4 
{  
 
     public static void main(String[] args)
     {
           Test x= new Test(1, "vasuvarada");  // name changed to vasuvarada
            Test y= new Test(1, "satyaram");// now name again changed to satyaram
       
        System.out.println(x.id  +" "+ Test.name);
        System.out.println(y.id  +" "+ Test.name);
    }
    
}

// you can clear see that static doesnt depend on object is can be modiefied and change by any object 