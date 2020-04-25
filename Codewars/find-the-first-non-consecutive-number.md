### 문제
- [Find the first non-consecutive number](https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/train/java)

### 내 풀이
```java
class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                return array[i + 1];
            }
        }
        return null;
    }
}
```

### 다른 풀이1
```java
class FirstNonConsecutive {
    static Integer find(final int[] array) {
       for(int i = 1; i < array.length; ++i)
       {
         if(array[i] - array[i - 1] != 1)
         {
           return array[i];
          }
        }
       return null;
    }
}
```

### 다른 풀이2
```java
class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for(int i=1; i<array.length; i++){
          if(array[i]-array[i-1] != 1)  return array[i];
        }
        return null;
    }
}
```
