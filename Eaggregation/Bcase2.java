package Eaggregation;
class Address
{
    String city;
    String state;
    String country;

   public Address(String x, String y , String z)
    {
        this.city=x;
        this.state=y;
        this.country=z;
    }
}

 class Emp 
{
    int id;
    String name;
    Address address; //refernce variable for incoming obj

   public Emp(int x,String y,Address z)
   {
    this.id=x;
    this.name=y;
    this.address=z;
   }

   public void display()
   {
    System.out.println(this.id + " "+this.name);
    System.out.println(this.address.city+" "+this.address.country+" "+this.address.state);
   }

    
}

public class Bcase2 
{
   public static void main(String[] args)
   
   {
     Address a= new Address("Kakinada", "ANDHRA", "india");
    Emp e= new Emp(1, "VASUVARADA", a);
     e.display();

    
   }
}

// sending the parent class object as a variable to the child class