Public class Test{
  List<Integer> list = Array.asList(....a: 1, 2, 3, 4, 5, 6);

  List.stream()
      .filter(x -> x % 2 == 0);

  System.out.println(list);
}


//Output------> [1, 2, 3, 4, 5, 6]


//****************************************************************************************
//To collect, no terminal operation have to be applied
//.toList()
//.collect()
//.forEach()
//.count()

//*********View**********
//.filter()
//.map()
//.sorted()
//The streams follow the lazy evaluation


Public class Test{
  List<Integer> list = Array.asList(....a: 1, 2, 3, 4, 5, 6);

  List.stream()
      .filter(x -> x % 2 == 0);
      .toList();

  System.out.println(result);
}

//Output------> [2, 4, 6]
