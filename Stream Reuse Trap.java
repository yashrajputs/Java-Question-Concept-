public class Test{
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4);
    Stream<Integer> stream = list.stream();

    long count = stream.count();//.collect
    System.out.println("Total elements = " +count);
    System.out.println("Element = ");
    stream.forEach(System.out::println);
  }
}

//output------------> Total elements = 4
//java.langIllegalStateExpception: stream has already been operated upon or closed



public class Test{
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4);
    Stream<Integer> stream = list.stream();

    long count = stream.count();//.collect
    System.out.println("Total elements = " +count);
    
    System.out.println("Element = ");

    //stream = list.stream();
    list.stream().forEach(System.out::println);
  }
}
//output------------> Total elements = 4
//Elements = 
  //1
  //2
  //3
  //4
