

public class AtoI {

    public static void main(String[] args) {
        String s = "words -4193 w9ords";


        int sToI = atoi(s);
        System.out.println(sToI);

    }

    private static int atoi(String s) {

        String[] arr = s.split(" ");

        boolean isNegative = false;
        boolean foundDigit = false;
        StringBuilder sb = new StringBuilder();

        for (String temp : arr) {
            if (foundDigit) {
                break;
            }
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '-') {
                    isNegative = true;
                }

                if (Character.isDigit(temp.charAt(j))) {
                    sb.append(temp.charAt(j));
                    foundDigit = true;
                }

            }
        }

        String finalStr = "";

        if(foundDigit) {

            finalStr = sb.toString();

            if (isNegative) {
                finalStr = "-" + finalStr;
            }

        }
        else{
            finalStr = "0";
        }

        return Integer.parseInt(finalStr);
    }
}