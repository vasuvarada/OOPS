package Fpolymorphism.AmethodOverloading;


class Case1
{
    public void sum(int a,long b)
    {
        System.out.println(a+b); 
    } 
}



 class Case2 
{
 public void sum(int a ,int b)
 {System.out.println("first method invoked");}   

 public void sum(int a ,long b)
 {System.out.println("second mothod invoked");}
    
}


class Case3
{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
}


public class Bcase2 
{
    public static void main(String[] args) 
    {
       Case1 vasu=new Case1();
        vasu.sum(2,3 ); // here 3  is type promoted to long

       Case2 kaka=new Case2();
       kaka.sum(2,3);  // this shows that complier selects the most compactable method

       Case3 mawa = new Case3();
      // mawa.sum(2,3); // this will thorw error since its an ambiquity case
    }
    
}
