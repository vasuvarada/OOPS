package Cthis;

class A2
{  
    int id;
    
A2(){  
this(5);    //invoking current class constructor
System.out.println("hello a");  
}  

A2(int x)
{  
System.out.println(x);  
}

public void kaka()
{
    System.out.println(this.id); //gives null value
}

}  



public class C
{  
    public static void main(String args[])
    {  
    A2 a=new A2();  
    a.kaka();
    }
}  

//so we can reuse the constructor but note that Call to this() must be the first statement in constructor.


/*
 //this will give an error

 A2(){   
System.out.println("hello a");  
this(5); 
}  

A2(int x)
{  
System.out.println(x);  
}  

} 
    
 */