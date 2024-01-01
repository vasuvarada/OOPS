package Pinnerclasses;
// with interface


interface Eatable
{ 
     int x= 5000;
     void eat();  
}  
class TestAnnonymousInner1   // noo need for implementation
{  
 public static void main(String args[])
 {  

 Eatable e=new Eatable()
 {  
  public void eat(){System.out.println("nice fruits");}    // we must followt the rest rules of interface if we remove this method it trows error
 };  

 e.eat();  
 System.out.println(Eatable.x);
 }  
}  