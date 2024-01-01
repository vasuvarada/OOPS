package Hfinal;

// FINAL VARIABLES
class Bike9
{  
 final int speedlimit=90;//final variable  
 final int uninitialized; //uninitialize final variable
 final static int  staticuninitialize;  // uninitialized  static final variable  
// this is same as static final  int  staticuninitialize;
 void run()
 {  
  //speedlimit=400;    //when u open this it will give u compilation error says that it cant be overriden again
 } 

 Bike9()
 {
    uninitialized=100;   // the uninitialzied final variable can only be initizalied in a construtor  it will give u compilation error when u leave it unntiazled so you cnt even think of initializeing in main method 
    // since statics doesnt depend on obj we cant insitalize it in constructor
 }

 static
 {
    staticuninitialize=200;   // the uninitialzied static final variable can only be initizalied in a construtor  it will give u compilation error when u leave it unntiazled, so you cnt even think of initializeing in main method ,also u cant initiated in constructor becoause its static variable 
 }
 
}
 
public class Acase1 
{
 public static void main(String args[]){ 
// this object explains u for normal final varaible 
 Bike9 obj=new  Bike9();  
 obj.run();  
 System.out.println(obj.speedlimit);
 // obj.speedlimit = 200;  this will aslo give u compilation error saying you cant edit final variable


 // this object explains u for final ininitiazled variable
 Bike9 obj2= new Bike9();
//obj2.initialized=4; // complation error
 System.out.println(obj2.uninitialized);

 // for staticfinal variables

 System.out.println(Bike9.staticuninitialize);
 }  
    
}
