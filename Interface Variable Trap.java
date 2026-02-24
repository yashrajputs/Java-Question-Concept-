interface test {
  int x = 10;
}
 class Main{
   public static void main(String[] args){
     test.x = 20;
     System.out.println(test.x);
   }
 }

// output -----> error: cannot assign a value to t\static final variable x

interface test{
  int x = 10;
}
       |
       |
       |
       |
  interface test{
         public static final int x = 10;
  }                |
                   |
                   |
         (Class, interface variable)
              (not a object)
