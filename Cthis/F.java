package Cthis;


class F{  
  int data=10;  
  F()
  {  
   A3 b=new A3(this);  
   b.display();  
  }  
  public static void main(String args[]){  
   F a=new F();  
  }  
}  


// passing argument in constructor call 
class A3{  
   F obj;  // creating a refernce varaible of F which stores incoming objects
  A3(F obj)
  {  
    this.obj=obj;  
  }  
  void display()
  {  
    System.out.println(obj.data);//using data member of A4 class  
  }  
}  
  
 
//We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes. Let's see the example:

