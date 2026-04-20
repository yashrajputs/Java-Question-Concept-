class CatShop {
  public String getCar() {
    return "cat";
  }
}

public class Test {
  public static void main(String[] args){
    CatShop catShop = new CatShop(); //object

    String animal = catShop.getCat();

    System.out.println(animal.toUpperCase());
  }
}
// Output-----> CAT

class CatShop {
  public String getCar() {
    return null;
  }
}

public class Test {
  public static void main(String[] args){
    CatShop catShop = new CatShop(); //object

    String animal = catShop.getCat();

    System.out.println(animal.toUpperCase());
  }
}
//Exception in thread "main" java.lang.NullPointerException: "String.toUpperCase()" 



class CatShop {
  public Optional<String> getCar() {
    return Optional.of("cat");
  }
}

public class Test {
  public static void main(String[] args){
    CatShop catShop = new CatShop(); //object

    Optional<String> animal = catShop.getCat();

   // if(animal != null) {
    if(animal.isPresent()){
    System.out.println(animal.get().toUpperCase());
    }else{
      System.out.println("Animal is not present");
      
    }
    
   // }
  }
}
// Output ----> CAT

class CatShop {
  public Optional<String> getCar() {
    return Optional.of(null); 
   
  }
}

public class Test {
  public static void main(String[] args){
    CatShop catShop = new CatShop(); //object

    Optional<String> animal = catShop.getCat();

   // if(animal != null) {
    if(animal.isPresent()){
    System.out.println(animal.get().toUpperCase());
    }else{
      System.out.println("Animal is not present");  
    }
   // }
  }
}
// Output ----> Exception in thread "main" java.lang.NullPointerException


class CatShop {
  public Optional<String> getCar() {
    //return Optional.of(null); 
    return Optional.ofNullable(null);
  }
}

public class Test {
  public static void main(String[] args){
    CatShop catShop = new CatShop(); //object

    Optional<String> animal = catShop.getCat();

   // if(animal != null) {
    if(animal.isPresent()){
    System.out.println(animal.get().toUpperCase());
    }else{
      System.out.println("Animal is not present");  
    }
   // }
  }
}
// Output ------> Animal is not present

  // Optional<String>
   //   /--> To make the absence of a value explicit and reduce the mess caused by null.
// return optional.ofNullabl("cat");


//String animal = getAnimal();
//            |
//            |
//Optional<String> animal  = getAnimal();

//Optional<String> animal  = Optional.ofNullable(getAnimal());

    
