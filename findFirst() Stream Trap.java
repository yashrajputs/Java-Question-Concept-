public class Test {
  public static void main(String[] args) {
    List<Integer> list List.of(1, 2, 4, 6, 8);

    Optional<Integer> mewList = list.stream()
      .filter(x -> {
        System.out.println("Checking: " + x);
        return x % 2 == 0;
      })
      .findFirst();
    System.out.println(newList);
  }
}

// output----->Checking: 1
//             Checking: 2
//             Optional[2]

//Java stopped after finding the first match.
  //It never ever looked at 4, 6, or 8
  //"Short-circuit evaluation"
//"findFirst() doesn't need the full result.So, the stream stops as soon as it find one match"
  
