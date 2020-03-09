import java.util.*;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        Collections.reverse(list);

        String[] reversedArr = list.toArray(new String[list.size()]);
        return reversedArr;
    }
}