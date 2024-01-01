package Dinheritence;

class Anmal
{  
void eat(){System.out.println("eating...");}  
}  

class Dg extends Anmal  // child 1
{  
void bark(){System.out.println("barking...");}  
}  

class BabyDog extends Dg // child of child1
{  
void weep(){System.out.println("weeping...");}  
}  


public  class Bmultilevel{  
public static void main(String args[])
{  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  