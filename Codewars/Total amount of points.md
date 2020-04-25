### 문제
- [Total amount of points](https://www.codewars.com/kata/5bb904724c47249b10000131/train/java)

### 내 풀이
```java
import java.util.*;
import java.lang.*;

public class TotalPoints {
  
    public static int points(String[] games) {
      int sum = 0;
      
      for (String game : games) {
       String[] splited = game.split(":");
       int x = toInt(splited[0]);
       int y = toInt(splited[1]);
        sum += compareNumbers(x, y);
      }
      return sum;
    }
    
    public static int toInt(String s) {
      int num = Integer.parseInt(s);
      return num;
    }
    
    public static int compareNumbers(int x, int y) {
      int point = 0;
      
      if (x > y) {
        point = 3;
      } else if (x < y) {
        point = 0;
      } else {
        point = 1;
      }
      return point;
    }
}
```
### 다른 풀이1
```java
public class TotalPoints {
  
    public static int points(String[] games) {
        int sum = 0;
        
        for (String s : games) {
          char x = s.charAt(0),
               y = s.charAt(2);
          
          sum += x > y ? 3 : x == y ? 1 : 0;
        }
        
        return sum;
    }
}
```

### 다른 풀이2
```java
public class TotalPoints {
  
    public static int points(String[] games) {
      int total = 0;
        for(String s : games){
          int x = Integer.parseInt(s.split(":",2)[0],10);
          int y = Integer.parseInt(s.split(":",2)[1],10);
          if(x > y){ total += 3;}
          if(x == y){ total += 1;}
        }
      return total;
    }
}
```
