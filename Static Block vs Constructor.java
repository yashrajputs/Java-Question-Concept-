public class Test{
     static int x = 10 ; // Static variable belong to a class and not to every instance.
  //static is common for all the object, because he belongs to the class.
     static {
           x += 5;
     }
  //instance block
{
    x = x + 2;
}
Test() {
 x = x + 3;
}
public Static void main(String[] args) {
     Test t1 = new Test(); //------------------
                                         //   |--------> object
     Test t2 = new Test();//-------------------
     System.out.println(x);
 }
}

//OutPut-----> 25


// when the class loads:
// 1. Static variable and static blocks---------->Run once, when class loads.
// 2.Instance blocks---------------->Run every time on object is created.
//Constructor-------------> Runs after instance blocks, for each cbject.

  //  Class Loads -> Static  runs once
// object created -> Instance Blocks -> Constructor 

class Test{
  Static{
    System.out.println("Static Block");
  }
  {
    System.out.println("Instance Block");
  }
  Test(){
    System.out.println("Constructor");
  }
}


