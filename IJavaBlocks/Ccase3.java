package IJavaBlocks;
// Java Program to Illustrate Execution of Static Block
// Before Constructors

class paper
{
    paper()
    {
        System.out.println("u need paper for test");
    }
}



class Test extends paper {

	// Case 1: Static variable
	static int i=0;
	// Case 2: Non-static variable
	int j;

	// Case 3: Static blocks
	static
	{
		i = i+10;
		System.out.println("static block called ");
	}

	// Constructor calling
	Test() { System.out.println("Constructor called"); }
}

// Class 2
// Main class
public class Ccase3 {

	// Main driver method
	public static void main(String args[])
	{

		// Although we have two objects, static block is
		// executed only once.
		Test t1 = new Test();
        System.out.println(Test.i);

		Test t2 = new Test();
        System.out.println(Test.i);  // you can clearly see static varible not changing
	}
}

//static variable nor changing : 
/*
  the static variable i is initialized and modified within the static block of the Test class. 
  The static block is executed only once when the class is loaded, and it runs before the execution of any constructor or method in the class.
   Therefore, the static block increments the value of i during the class initialization, but this happens only once,
    regardless of how many objects of the class are created.

    once the static block is loaded (i.e fir the first object ) it wont get into it no matter how many objects u create
 */