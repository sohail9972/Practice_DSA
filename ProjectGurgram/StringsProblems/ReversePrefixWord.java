package ProjectGurgram.StringsProblems;

public class ReversePrefixWord {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdiedsfs",'i'));
    }
    public static String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);
        if (i != -1) {
            return new StringBuilder(word.substring(0, i + 1)).reverse().toString() + word.substring(i + 1);
        }
        return word;
    }
}
