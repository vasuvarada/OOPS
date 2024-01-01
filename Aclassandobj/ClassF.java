package Aclassandobj;

class Collegue
{
    int id;
    String name;
}
public class ClassF
{
  public static void main(String[] args) {
      Collegue x= new Collegue();
      Collegue y=x;
      x.id=45;
     System.out.println(y.id);

  }    
}

// this shows that objects are created in heap memory and the refrences of that memory are stored in refrence variables x and y