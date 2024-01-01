// creating object outside the class

package Aclassandobj;
 class Students
{
   int x;
   String name;    
}

class ClassB
{
    public static void main(String[] args) 
    {
        Students vasu = new Students();
        System.out.println(vasu.x);
    }
}

