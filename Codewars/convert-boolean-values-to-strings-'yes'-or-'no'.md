- [Convert boolean values to strings 'Yes' or 'No'.](https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java)
  
### 내 풀이
```java
class YesOrNo
{
  public static String boolToWord(boolean b)
  {
    String str = b? "Yes" : "No";
    return str;
  }
  
}
```


### 다른 풀이1
```java
class YesOrNo
{
  public static String boolToWord(boolean b)
  {
    return b ? "Yes" : "No";
  }
  
}
```

### 다른 풀이2
```java
class YesOrNo
{
  public static String boolToWord(boolean b)
  {
    if(b) return "Yes";
    else return "No";
  }
  
}
```
