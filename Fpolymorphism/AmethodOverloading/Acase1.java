package Fpolymorphism.AmethodOverloading;
class Adder{  
static int add(int a,int b)
{return a+b;}  
//static double add(int a,int b){return a+b;}  
// when u open this comments it will thorugh and compilation error  (error: method add(int,int) is already defined in class Adder)
}  


public class Acase1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(2,3));
    }
    
}



