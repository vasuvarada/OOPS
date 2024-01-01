// object created inside the class

package Aclassandobj;


 class ClassA {
    int x;
    String y;

    public static void main(String[] args) {
        ClassA vasu = new ClassA(); // creating an object 
        System.out.println(vasu.x); // Prints the default value of int (0)
        System.out.println(vasu.y); // Prints the default value of String (null)
    }
}
