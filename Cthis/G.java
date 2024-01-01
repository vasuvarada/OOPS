package Cthis;

// invoking method with params
class S2{  
  void m(S2 obj)
  {  
  System.out.println("method is invoked");  
  }  
  void p(){  
    this.m(this);  
  }  
 
}  

public class G {

  public static void main(String args[]){  
  S2 s = new S2();  
  s.p();  
  }  
    
}
