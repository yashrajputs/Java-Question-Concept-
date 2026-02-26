interface test{
  void show();
}
class testClass implements test {
  public void show(){
    System.out.println("Showing");
  }
}

class Main {
  public static void main(String[] args) {
    testClass1 obj = new testclass();
  }
}

//output-----> Showing

//**************************************Default Method Trap******************************

interface test{
  void show();

  default void display(){
    System.out.println("Default Display Method");
  }
}
class testClass1 implements test {
  public void show(){
    System.out.println("testClass1 Showing");
  }
}
class testClass2 implements test {
  public void show(){
    System.out.println("testClass2 Showing");
  }
}
class testClass3 implements test {
  public void show(){
    System.out.println("testClass3 Showing");
  }
}

class Main {
  public static void main(String[] args) {
    testClass1 obj = new testclass();
    obj.show();
    obj.display();
  }
}

//output-----> Showing
