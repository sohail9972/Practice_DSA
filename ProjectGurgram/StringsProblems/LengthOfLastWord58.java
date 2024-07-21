package ProjectGurgram.StringsProblems;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        char[] ch = s1[s1.length - 1].toCharArray();
        int count = 0;
        for (char c : ch) {
            count++;
        }
        return count;
    }
}