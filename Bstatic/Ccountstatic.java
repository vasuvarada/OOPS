package Bstatic;
public class Ccountstatic
{  
int count=0;//will get memory each time when the instance is created  
static int countt =0;//will get memory only once and retain its value  (also note that it is stored in non heap also not stack )
  
Ccountstatic()
{  
count++;//incrementing value  
countt++;//incrementing value 
System.out.println("non static :" +count);  
System.out.println("static :" +countt);  
}  
  
public static void main(String args[]){  
//Creating objects  
Ccountstatic c1=new Ccountstatic();  
Ccountstatic c2=new Ccountstatic();  
Ccountstatic c3=new Ccountstatic();  
}  
}  

// we c an  clearly see static retaining its previous values after manipulated by the objects

/*4
the countt variable is declared as a static variable,
 which means it is associated with the class rather than with instances of the class. As a result, 
 there is only one copy of the countt variable that is shared among all instances of the class.

In the constructor of the class (Ccountstatic), each time an object is created, 
the countt static variable is incremented. Since there is only one countt variable shared among all instances,
 every time a new object is created, the same countt variable is updated. \
 This leads to the appearance of the static variable being continuously updated even for new objects.*/