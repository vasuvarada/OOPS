package Gsuper;



class A {
    A() {
        System.out.println("Constructor in class A");
    }
}

class B extends A {
    B() {
        super(); // Call constructor of class A
        System.out.println("Constructor in class B");
    }
}

class C extends B {
    C() {
        super(); // Call constructor of class B
        System.out.println("Constructor in class C");
    }
}

public class Dcase4 {
    public static void main(String[] args) {
        C c = new C();
    }
}


/*
  Class A has a constructor that prints a message.
Class B extends A and calls super() in its constructor to invoke the constructor of A. It also prints a message.
Class C extends B and calls super() in its constructor to invoke the constructor of B. It also prints a message.
When you create an instance of class C, the constructors are called in the order of the inheritance hierarchy:
 */