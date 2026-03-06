//What methods can be called ------> Reference type
//What methods actually runs -------> object type

class Parent{
  void show() {
    System.out.println("Parent show mehtod");
  }
  void display() {
    System.out.println("Parent display mehtod");
  }
}

class child extends Parent {
  void show() {
    System.out.println("Child show method");
  }
  void childMehtod {
    Systsm.ou.println("Child childMehtod");
  }
}

class Main{
  public static void main(Strind[] args) {
    Parent obj = new child();

    obj.show();
    obj.display();
    obj.childMethod();
  }
}

//output------> error:cannot find symbol
//             obj.childMethod();
                  ^
// symbol: method childMehtod()
//location: variable obj of type Parent


//Parent obj = new child();
  |               |
  |               |
  |            //child object                
//Reference
 // type


class Parent{
  void show() {
    System.out.println("Parent show mehtod");
  }
  void display() {
    System.out.println("Parent display mehtod");
  }
}

class child extends Parent {
  void show() {
    System.out.println("Child show method");
  }
  void childMehtod {
    Systsm.ou.println("Child childMehtod");
  }
}

class Main{
  public static void main(Strind[] args) {
    Parent obj = new child();

    obj.show();
    obj.display();
    //obj.childMethod();
  }
}

//output--------->Child show method
//                 Parent display mehtod
