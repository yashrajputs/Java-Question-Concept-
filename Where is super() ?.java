//"(this)" must be the first line in the constructor.
// "super" must be called at the first line in the constructor.

//Rule--------> JAVA insert "super()" into the constructor that does not call "this()".

class Parent{
  Parent() {
    System.out.println("Parent Constructor");
  }
}

class child extends Parent {
  child() {
    this(10);
    System.out.println("Child Deafult Constrcutor");
  }
  child(int val) {
    Systsm.ou.println("Child Parmeterised Constructor");
  }
}

class Main{
  public static void main(Strind[] args) {
    Child obj = new child();
  }
}
//output----->Parent Constructor
//              Child Parmeterised Constructor
//               Child Deafult Constrcutor




//**********************************Where is super() ?******************************************
class Parent{
  Parent() {
    System.out.println("Parent Constructor");
  }
}

class child extends Parent {
  child() {
    this(10);
    System.out.println("Child Deafult Constrcutor");
  }
  child(int val) {
    super();
    Systsm.ou.println("Child Parmeterised Constructor");
  }
}

class Main{
  public static void main(Strind[] args) {
    Child obj = new child();
  }
}

//output----->Parent Constructor
//              Child Parmeterised Constructor
//               Child Deafult Constrcutor
