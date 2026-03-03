class Parent{
  parent(){
    System.ou.println("Parent Conmstructor");
  }
}  
class child extends parent {
  child() {
    // by default using super
    System.out.println("child Constructor");
  }
}

pulbic class Test {
  public static void main(String[] args){
    Child ch = new child();
  }
}

//Output----> Parent Cnstructor
//            Child Constructor



class Parent{
  parent(){
    System.ou.println("Parent Conmstructor");
  }
}  
class child extends parent {
  child() {
    super(); // add super
    System.out.println("child Constructor");
  }
}

pulbic class Test {
  public static void main(String[] args){
    Child ch = new child();
  }
}

//Output----> Parent Cnstructor
//            Child Constructor
