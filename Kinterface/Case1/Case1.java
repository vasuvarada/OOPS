package Kinterface.Case1;


class Case1  implements Printable
{

    public void print(){System.out.println("Hello");} // when u remove this line of code java throughs error cp
    // when we implment any interface it must have all the methods implmented
    // also the defined mehtod should be public 


    // non implemented  methods need not to be public
     void kaka()  // we can use more methods than the given interface no issues
    { System.out.println("can access the random methods of child class");}


    public static void main(String args[])
    {  // obj of child class reffered with same class
        Case1 obj = new Case1();  
        obj.print();  // prints inherited method
        obj.kaka();
        // feild in the interface is staic and final as default 
        //static proof
        //System.out.println(obj.x);  // when u  open this it will throw complie time error is static fields dosent depend on obj it should be accesed in static way
        System.out.println(Printable.x);

        //final proof
        //Printable.x=877; when u open this we can clearly see it cant be edited
 
        //obj of child class reffered with intrface
        // same as runtime polumorphism
        Printable p= new Case1();
        p.print();
        //p.kaka(); // cant acces child method

       
    }     
}


