package Cthis;
 class A 
 {
    
    int rollno;  
    String name;  
    float fee; 

 /*
 // when you run this objects wont get any value becaause variable name and instance variable name both are same java gets confused 
A(int rollno,String name,float fee)
{  
rollno=rollno;  
name=name;  
fee=fee;  
}  

 */

 // hence we use this keyword
 A(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
    }  

/*
 // program would be fine if we use direct names but pratice to use this keyword
    A(int r,String n,float f){  
        rollno=r;  
        name=n;  
        fee=f;  
        }  

 */

void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
class TestThis1{  
public static void main(String args[]){  
A s1=new A(111,"ankit",5000f);  
A s2=new A(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  