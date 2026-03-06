class Parent{
  Parent() {
    System.out.println("Parent Constructor");
  }
}

class child extends Parent {
  child() {
    System.out.println("Child Deafult Constrcutor");
    super();
  }
}
 
class Main{
  public static void main(Strind[] args) {
    Child obj = new child();
  }
}

// output-------> error: super();
                          ^


class Parent{
  Parent() {
    System.out.println("Parent Constructor");
  }
}

class child extends Parent {
  child() {
    super();
    System.out.println("Child Constrcutor");
    
  }
}
 
class Main{
  public static void main(Strind[] args) {
    Child obj = new child();
  }
}

//output-----> Parent Constructor
  //              Child Constrcutor
