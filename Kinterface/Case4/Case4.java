package Kinterface.Case4;

public class Case4  implements Animal{

  
    public void animal() {
        System.out.println("animal method implemented in child class");
        
    }

    // no need to implement non abstract methods

    public static void main(String[] args) {
        Case4 obj = new Case4();
        obj.animal();
        obj.kaka();
        Animal.mawa();
    }
    
}
