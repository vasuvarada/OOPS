package Pinnerclasses;


public class  Dloaclinnerclass
 {  
    private int data=30;//instance variable  
     void display(){  
     class Local
       {  
           int x=5000;
           void msg(){System.out.println(data);}    

       }  
    Local l=new Local();  
    l.msg();  
 }  
 public static void main(String args[])
 
 {  
  Dloaclinnerclass obj=new Dloaclinnerclass();  
  obj.display();   // we have accesed private data here
  //System.out.println(obj.x);  // we cant access the local inner class with outer class obj
 }  

}  