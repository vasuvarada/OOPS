class TestMemberOuter1{  
 private int data=30;  
 void msg()
 {
  System.out.println("vasuvarada");
 }
 class Inner{  
  void msg(){System.out.println("data is "+data);}  //innerclass accessing outer class fields
 }  
 public static void main(String args[]){  
  TestMemberOuter1 obj=new TestMemberOuter1();  
  TestMemberOuter1.Inner in=obj.new Inner();  
  obj.msg();
  System.out.println(obj.data);
  in.msg();  
  //System.out.println(in.data); with an object of inner class  we cant access outer class fileds  but in innerclass can access outerclass fields
 }  
}  