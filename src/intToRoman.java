import java.util.Map;
import java.util.TreeMap;

public class intToRoman {

    public static void main(String[] args) {
        int num = 16;

        String roman = integerToRoman(num);

       roman =  roman.replace('X', '\0');

        System.out.println(roman);
    }

    private static String integerToRoman(int num) {

        TreeMap<Integer, String> map = new TreeMap<>((a, b) -> (b - a));
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        System.out.println("Tree map: " + map);

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (num >= entry.getKey()) {
                result.append(entry.getValue());
                num -= entry.getKey();
            }
        }
        return result.toString();

    }
}
