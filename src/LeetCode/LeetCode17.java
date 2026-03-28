package LeetCode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class LeetCode17 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        Hashtable<String, String[]> digitValues = new Hashtable<>();
        digitValues.put("2", new String[]{"a", "b", "c"});
        digitValues.put("3", new String[]{"d", "e", "f"});
        digitValues.put("4", new String[]{"g", "h", "i"});
        digitValues.put("5", new String[]{"j", "k", "l"});
        digitValues.put("6", new String[]{"m", "n", "o"});
        digitValues.put("7", new String[]{"p", "q", "r", "s"});
        digitValues.put("8", new String[]{"t", "u", "r"});
        digitValues.put("9", new String[]{"w", "x", "y", "z"});

        

        return res;
    }

    public static void main(String[] args) {
        LeetCode17 leetCode17 = new LeetCode17();
        System.out.println(leetCode17.letterCombinations("23"));
    }
}
