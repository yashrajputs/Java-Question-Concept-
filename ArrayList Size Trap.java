public static Main{
  public static void main(String[] args){
    ArrayList<Integer> List = new ArrayList<>(10);


    System.out.println(list.size());
  }
 }
//output = 0



          //      *******Size*******
public static Main{
  public static void main(String[] args){
    ArrayList<Integer> List = new ArrayList<>(10);
    list.add(1);
    list.add(2);
    System.out.println(list.size());
  }
 }
//output = 2

// how size will incrementing (size = s + 1)




                // new ArrayList<>(10)
                            |
                            |
                            |
                 _______________________
                |                       |
                |                       |
        capacity=10                   size
 (how many elements it can hold       (how many elements it acually contais)
        without resizing)      

                                __________
        ( Array List Capacity) | not equal|  (ArrayList size)
    
