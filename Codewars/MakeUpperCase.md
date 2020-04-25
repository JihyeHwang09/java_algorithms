### 문제
- [MakeUpperCase](https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/train/java)

### 내 풀이
```java
class Upper{
  public static String MakeUpperCase(String str){
    return str.toUpperCase();
  }
}
```

### 다른 풀이1
```java
class Upper{
  public static String MakeUpperCase(String str){
    return str == null ? null : str.toUpperCase();
  }
}
```

### 다른 풀이2
```java
import java.nio.charset.StandardCharsets;

class Upper{
  public static String MakeUpperCase(String str){
    byte[] bytes = null;
    bytes = str.getBytes(StandardCharsets.US_ASCII);

    // a - 97, z - 122
    // A - 65, Z - 90
    for (int i = 0; i < bytes.length; i++) {

      byte b = bytes[i];

      if (b > (byte) 'a' && b < (byte) 'z') {
        bytes[i] = (byte) (b - 32);
      }
    }

    return new String(bytes, StandardCharsets.US_ASCII);
  }
}
```

