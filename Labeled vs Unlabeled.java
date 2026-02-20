// Labeled  break concept

public class Main {
  public static void main(String[] args) {
    outerLoop:
    for(int i = 1; i < 10; i++){
       for(int j = 1; j < 10; j++) {
         if(i == 2 && j == 5) {
           break outerLoop;// labeled break Statement
         }
       }
    } 
  }
}


// Unlabeled break concept


public class Main {
  public static void main(String[] args){
    for(int i = 1; i < 10; i++){
       for(int j = 1; j < 10; j++) {
         if(i == 2 && j == 5) {
           break;
         }
       }
    } 
  }
}
