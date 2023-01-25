package main;

import java.util.HashMap;
import java.util.Map;

public class LongestSub {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int p1 = 0, p2 = 0, temp = 0, longest = 0;

        if(s.length() <= 1){
            return s.length();
        }

//        map.put(s.charAt(p2), p2);

        while (p2 < s.length()) {

            int seenCharIndex = 0;

            if(!map.containsKey(s.charAt(p2))) {
                map.put(s.charAt(p2), p2);
            }

            else {


                if (map.get(s.charAt(p2)) >= p1) {
                    map.replace(s.charAt(p2), p2);
                    p1 = map.get(s.charAt(p2));
                }

                temp = p2-p1+1;
            }
            longest = Math.max(longest, temp);
            p2++;
        }

       return longest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aabaab!bb"));
    }
}