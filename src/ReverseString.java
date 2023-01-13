public class ReverseString {

    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        String[] array = s.split(" ");

        System.out.println(reverse(array));
    }

    private static String reverse(String[] arr) {

        String reversedStr = "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);

                sb.reverse();

                reversedStr = reversedStr + sb.toString();
            if(i != arr.length - 1) {
                reversedStr = reversedStr + " ";
            }

            sb.delete(0, sb.length());
        }

        return reversedStr;
    }
}
