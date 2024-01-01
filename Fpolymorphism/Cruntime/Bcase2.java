package Fpolymorphism.Cruntime;


class  Student
{
    int overridevariable=5000;
    int x=8000;
     void kaka()
    {System.out.println("method of student");}

     void mawa()
    {System.out.println("seperate method of student");}

}

class Classroom extends Student
{
    int overridevariable=6000;
    int y=9000;
      void kaka()
     {System.out.println("method of classroom");}

     void  bro()
     {System.out.println("seperate method of classroom");}
}



public class Bcase2
{
    public static void main(String[] args)
    {
         Classroom c= new Classroom();  // object of classsroom refred by classroom 
         c.kaka(); //overriden by child
         c.bro();
         c.mawa();
         System.out.println(c.x);
         System.out.println(c.overridevariable); //overidenby child
         System.out.println(c.y);
         //this shows it has access to  all parent and child classes variables and methods  when they was an overriding (method or variable it gives prefernce to child)

         Student s= new Classroom();//OBJECT OF CHILD CLASS REFFRED BY PRENT CLASS
         s.kaka();
       //  s.bro();  child class overriden method cant be access
         s.mawa();
         System.out.println(s.x);
         System.out.println(s.overridevariable); // is not overriden by child
         //System.out.println(s.y);  //cant access child class variables

         // so this object can access all the parent methods and variables , when come to child class it can access only methods overriden by it it cant access the variables overriden by it also  

         

    }
    
}
