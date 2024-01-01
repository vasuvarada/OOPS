package Cthis;
//this: to invoke current class method with no arguments
class A1{  

void m()
{
    System.out.println("hello m");
}  

void n()
{  
System.out.println("hello n");  
//m();//same as this.m()  
this.m();    // or we can use m();    // invoking current class method
} 

} 


class B
{  
public static void main(String args[])
{

A1 a=new A1();  
a.n();  
}
}  
