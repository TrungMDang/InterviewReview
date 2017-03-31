/**
 * Created by Trung on 3/28/2017.
 */
public class _9_PalindromeNumberMain {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        else {
            String s = x +"";
            int i = 0, j = s.length() - 1;
            while (i < s.length() && j >= 0) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++; j--;
            }
        }
        return true;
    }

    public static void main(String...args) {
        System.out.println(isPalindrome(1231));
    }

}
