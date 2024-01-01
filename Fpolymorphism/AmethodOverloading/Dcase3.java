package Fpolymorphism.AmethodOverloading;



class Animal{  
void eat(){System.out.println("animal is eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("dog is eating...");}  
}  
class Dcase3 extends Dog{  
public static void main(String args[]){  
Animal a=new Dcase3();  
a.eat();  
}}  


//Since, BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.