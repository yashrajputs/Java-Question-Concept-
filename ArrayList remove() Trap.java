//ArrayLsit Concept

public class Main{
  public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<Integer>{};

    al.add(10);
    al.add(20);
    al.add(30);

    System.out.printlc(al);

    //al.remove(10);//   this will tell us about the index number 10 in ArrayList
    al.remove(Integer.valueOf(10));
    System.out.println(al);
  }
}


//ArrayList class has two overload remove():
//   |
//   |----->remove(int index)
 //  |------>remove(object o)
//Integer o = Integer.valueOF(20);
//remove(20);
