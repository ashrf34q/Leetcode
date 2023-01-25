package main;

public class Palindrome {

    private static boolean validPalindrome(String s) {

            String result = "";

            for (int i = 0; i < s.length(); i++) {

                if(Character.isLetterOrDigit(s.charAt(i))){
                    result += s.charAt(i);
                }

//                if (s.charAt(i) > 64 && s.charAt(i) <= 122) {
//
//                        result += s.charAt(i);
//                }
//
//                else if(Character.isDigit(s.charAt(i))){
//                    result += s.charAt(i);
//                }
            }
            result = result.toLowerCase();
            System.out.println(result);

        int pl = 0;
        int pr  = result.length()-1;

        while (pl <= pr) {
            if(result.charAt(pl) == result.charAt(pr)){
                pl++;
                pr--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "ab_a";
        System.out.println(validPalindrome(s));
    }
}
