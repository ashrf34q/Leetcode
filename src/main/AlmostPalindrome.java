package main;

public class AlmostPalindrome {

    private static boolean isAlmost(String s) {


        // TODO: Check if it's a palindrome, once we find conflicting characters then extract both strings,
        //  if any of them produces a palindrome, then return true. Else, false.

        int p1 = 0, p2 = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder(s);

        while(p1 < p2) {
            if(!(s.charAt(p1) == s.charAt(p2))){
                sb.deleteCharAt(p1);
                sb1.deleteCharAt(p2);

                return isValid(sb.toString()) || isValid(sb1.toString());
            }

            p1++;
            p2--;
        }

        return true;
    }

    private static boolean isValid(String result){
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
        String s = "abca";

        System.out.println(isAlmost(s));
    }
}
