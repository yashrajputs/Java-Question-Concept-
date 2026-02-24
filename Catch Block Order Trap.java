//And always remember java never allows an unreachable catch block

public class Main {
  public static void main(String[] args){
    try{
      int a = 10/0;
    }catch (Exception e) {
      System.out.println(e.getMessage());
    }catch (ArithmeticExecption e) {
      System.out.println(e.getMessage());
    }
  }
}

//output ------->error: exception ArithmeticExecption caught
                      //      }catch (ArithmeticExecption e){
                     //         ^

//correct
public class Main {
  public static void main(String[] args){
    try{
      int a = 10/0;
    }catch (ArithmeticExecption e) {
      System.out.println(e.getMessage());
    }catch (Execption e) {
      System.out.println(e.getMessage());
    }
  }
}
//output-----> / by zero


                 //                   Execption (parent class)
                                             |
                                             |
                                             |
                     //              ArithmeticExecption (child class)
