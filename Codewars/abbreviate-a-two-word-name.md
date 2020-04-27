### 문제
- [Abbreviate a Two Word Name](https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3)

### 내 풀이
```java
import java.util.*;

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
   
   String[] array = name.split(" ");
 
   StringJoiner strJoiner = new StringJoiner(".");

   for (String word : array) {
    strJoiner.add(getFirstWord(word)); 
   }
   
   name = strJoiner.toString();
   return name;
  }
  
  public static String getFirstWord(String str) {
    String firstWord = String.valueOf(str.charAt(0)).toUpperCase();
    return firstWord;
  }
  
}
```

### 다른 풀이1
```java
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] names = name.split(" ");
    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
  }
}
```

### 다른 풀이2
```java
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
  }
  
}
```

### 다른 풀이3
```java
public class AbbreviateTwoWords {

 public static String abbrevName(String name) {
          
        String[] init = name.split(" ");
        return init[0].substring(0, 1).toUpperCase().concat("."+ init[1].substring(0, 1).toUpperCase());
    }
}
```

### 다른 풀이4
```java
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    name = name.toUpperCase(); 
    return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
  }
}
```
