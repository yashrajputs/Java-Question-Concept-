@FunctionalInterface
  interface test{
    //there are two abstract methods
    //we wrtie only abstract methods inside the interface
    void show();
    void print();
  }
class testclass implements test{
  public void show(){
    System.out.println("Showing");
  }
  public void print(){
    System.out.println("Printing");
  }
}

class Main{
  public static void main(String[] args) {
    testClass obj = new testClass();
    obj.show();
    obj.print();
  }
}

//Output----> Error: Unexpected @FunctionalInterface annotation @FunctionalInterface
  //                                                            ^
//test is not functional interface
//multiple non-overriding abstract method found in interface test

//*****************************************CORRECT***************************************************

@FunctionalInterface
  interface test{
    //there are two abstract methods
    //we wrtie only abstract methods inside the interface
    void show();
  }
class testclass implements test{
  public void show(){
    System.out.println("Showing");
  }
}

class Main{
  public static void main(String[] args) {
    testClass obj = new testClass();
    obj.show();
  }
}
//OutPut-----> Showing


//*********************************
@FunctionalInterface //---------> @ Annotations 
  interface test{
    void show();
  }
//cannot have multiple abstract methods within a single function interface. only one abstract method functional interface
