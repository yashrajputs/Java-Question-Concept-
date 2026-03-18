public class Test {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 4, 6, 8);

        List<Integer> newList1 = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        

        List<Integer> newList2 = list.stream()
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println(newList1);
        System.out.println(newList2);

        newList1.add(10); 
        newList2.add(10); 
    }
}

//output------->  [2, 4, 6, 8]
            //    [2, 4, 6, 8]
//Exception in thread "main" java.lang.UnsupportedOperationException


public class Test {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 4, 6, 8);

        List<Integer> newList1 = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        

        List<Integer> newList2 = list.stream()
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println(newList1);
        System.out.println(newList2);

        newList1.add(10); 
      //  newList2.add(10); 
    }
}

//output------->  [2, 4, 6, 8]
            //    [2, 4, 6, 8]



List<Integer> newList1 = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        

        List<Integer> newList2 = list.stream()
                .filter(x -> x % 2 == 0)
                .toList();

//Java 16 ---------> toList()------> return an unmodified list
// Collection.tolist()----> mutable list


//Stream--> Data flows throug transformations, it doesn't get mutated.So, toList() follows that 
//           principle (return immutable list)

//Similarly, Java9 ----> List.of()--->unmodifiable
      //Java10--------> List.copyOf()-----> unmodifiable

//Immutability is the modern java default
