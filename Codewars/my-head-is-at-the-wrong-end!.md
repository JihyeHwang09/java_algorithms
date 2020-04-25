### 문제
- [My head is at the wrong end!](https://www.codewars.com/kata/56f699cd9400f5b7d8000b55/train/java)

### 내 풀이
```java
import java.util.*;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        Collections.reverse(list);

        String[] reversedArr = list.toArray(new String[list.size()]);
        return reversedArr;
    }
}
```

### 다른 풀이1
```java
public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    return new String[] {arr[2], arr[1], arr[0]};
  }
}
```

### 다른 풀이2
```java
import java.util.Collections;
import java.util.Arrays;

public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    String[] copy = arr.clone();
    Collections.reverse(Arrays.asList(copy));
    return copy;
  }
}
```

### 다른 풀이2
```java
public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    String[] result = new String[3];
    result[0] = arr[2];
    result[1] = arr[1];
    result[2] = arr[0];
    return result;
  }
}
```
