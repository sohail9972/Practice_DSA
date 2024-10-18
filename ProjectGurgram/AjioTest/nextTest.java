package ProjectGurgram.AjioTest;

public class nextTest {


        public static void main(String[] args) {
            String input = "My name is Sohail";
            String[] words = input.split(" ");
            String result = "";

            for (String word : words) {
                String reversedWord = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord += word.charAt(i);
                }
                result += reversedWord + " ";
            }

            // Trim the extra space at the end and print the result
            System.out.println(result.trim());
        }
    }



