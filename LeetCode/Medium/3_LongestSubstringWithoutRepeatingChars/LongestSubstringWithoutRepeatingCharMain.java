/**
 * Created by Trung on 3/22/2017.
 */

import java.util.Hashtable;
import java.util.regex.Pattern;

public class LongestSubstringWithoutRepeatingCharMain {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        if (s.length() <= 0) {
            return 0;
        }
        boolean notDone = true;
        Hashtable<Character, Integer> data = new Hashtable<>();
        while (notDone) {
            char c = s.charAt(i);
            if (data.get(c) != null) {
                i = data.get(c) + 1;
                break;
            }
            data.put(c, i);
            i++;
            if (i == s.length()) {
                notDone = false;
            }

        }
        if (data.size() == 95) //found the largest possible substring without repeating characters
        {
            return 95;
        }
        int l = lengthOfLongestSubstring(s.substring(i, s.length()));
        return (data.size() <= l) ? l : data.size();
    }

    public static void main(String...args) {
        System.out.println(lengthOfLongestSubstring("abc abc"));

    }



}
