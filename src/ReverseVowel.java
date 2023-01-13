public class ReverseVowel {

    public static void main(String[] args) {
        String s = "ltcod heje wkwkwk";

        String[] array = s.split(" ");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        if(s.contains("e")){
            System.out.println("Found");
        }
    }

}
