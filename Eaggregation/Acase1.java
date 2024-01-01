package Eaggregation;

class Operation
{
 Operation()
 {
  System.out.println("operation class cons invoked");
 }
   int square(int r)
   {return r*r;}
}


 class Circle
{
  double pi= 3.14;
  Operation obj;
  double area(int n)
  {
    obj= new Operation();
   double r= obj.square(n);
    return  r*pi;
  }


    
} 




public class Acase1 
{
    public static void main(String[] args) 
    {
        Circle c= new Circle();
        double area= c.area(8);
        System.out.println(area);     
    }
    
}


// creating obj of parent class directly in the child class