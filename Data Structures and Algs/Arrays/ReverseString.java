public class ReverseString {
    public static String reverseString(String a) {

        String outputString = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            outputString += a.charAt(i);
        }

        return outputString;
    }

    public static void main(String[] args) {
        String word = "Hi My Name is Daniel";
        System.out.println(reverseString(word));
    }
}