package main;

import java.util.ArrayList;

public class BackspaceString {
    static boolean backspaceCompare(String s, String t) {

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        extracted(s, list1);

        extracted(t, list2);

        return list1.equals(list2);
    }

    private static void extracted(String t, ArrayList<Character> list) {
        for(int j = 0; j < t.length(); j++) {
            if(t.charAt(j) == '#'){
                if(!list.isEmpty()) {
                    list.remove(list.size()-1);
                }
            }
            else{
                list.add(t.charAt(j));
            }
        }
    }

    public static void main(String[] args) {
        String s = "a###b";
        String t = "c";

        System.out.println(backspaceCompare(s,t));
    }

}
