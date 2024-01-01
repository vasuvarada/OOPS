package Dinheritence;

class Anial
{  

void eat()
{System.out.println("eating...");}  
}  

class Dogy extends Animal  //child 1
{  
void bark()
{System.out.println("barking...");}  
}  

class Caty extends Animal  // child 2
{  
void meow()
{System.out.println("meowing...");}  
}  


public class Cheriarcle
{  
public static void main(String args[])
{  
Caty c=new Caty();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  

}

}  