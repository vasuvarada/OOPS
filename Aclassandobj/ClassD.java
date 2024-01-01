package Aclassandobj;

// initiaizing obj data using a constructore and a methiod
 class Worker 
{
    int id;
    String name;
    void setter(int x ,String y)
    {
        this.id=x;     // id=x;
        this.name = y;   // id=y
    }

   public void display()
    {
        System.out.println("age :"+ id + " name is :"+ name);
    }
     
}

class ClassD
{
    public static void main(String[] args) 
    {
          Worker vasu=new Worker();
          vasu.setter(24, "vasuvarada");
           System.out.println(vasu.id);
           vasu.display();
    }
}
