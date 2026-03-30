String s = new String("Yes");
output-----> 2 Objects

  
  String s = "Yes";
  String s = new String("Yes");
 output-----> 2 Objects


  String s1 = "Yes";
  String s2 = "Yes";
noutput-----> 1 Objects


String s1 = new String("Yes");
String s2 = new String("Yes");
output-----> 3 Objects


  String s = new String("Yes").intern();
noutput-----> 1 Objects


| Code                          | Heap Objects | Pool Objects | Total |
| ----------------------------- | ------------ | ------------ | ----- |
| `new String("Yes")`           | 1            | 1            | 2     |
| `"Yes"` + `new String("Yes")` | 1            | 1            | 2     |
| `"Yes", "Yes"`                | 0            | 1            | 1     |
| `new String`, `new String`    | 2            | 1            | 3     |
| `new String().intern()`       | ~0 used      | 1            | 1     |
