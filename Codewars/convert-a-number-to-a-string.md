### 문제
- [Convert a Number to a String!](https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java)

### 내 풀이
```java
class Kata {
  public static String numberToString(int num) {
    return Integer.toString(num);
  }
}
```

### 다른 풀이1
```java
class Kata {
  public static String numberToString(int num) {
    return String.valueOf(num);
  }
}
```

### 다른 풀이2
```java
class Kata {
  public static String numberToString(int num) {
    // Return a string of the number here!
    return String.format("%d",num);
  }
}
```
