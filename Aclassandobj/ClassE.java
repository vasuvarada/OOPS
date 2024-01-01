// delclaring object from the constructor

package Aclassandobj;
 class Classmate 
{
    int x;
    String y;

    public void display()
    {
        System.out.println("\nnek friends enduk ra puka ");

    }

    Classmate() // no paramter constructor
    { 
        System.out.println("\nwhen you called object with no inputs this is invoked");
    }

    Classmate(int a , String b)  // parametrized constructor
    {
         this.display();    // constructor can call a method its own class method
         this.x= a;
         this.y=b;
         System.out.println("manchiga cheptuna vinu friends avasarame");
    }

    Classmate(int a) // single integer paramter constructor
    {
        System.out.println("\nyou have created an object which has only rollno but no name try printing name now it will give null ");
        this.x=a;
        
    }
    
}

public class ClassE 
{
    public static void main(String[] args)
    {
         Classmate kaka= new Classmate(); 
        System.out.println(kaka.x);

        Classmate vasu = new Classmate(5, "ERRIPUKu prapul"); // constructor is invoked at the object creation only 
        System.out.println(vasu.y);

        Classmate noname= new Classmate(1);
        System.out.println(noname.y);
    }

     
}
