package ProjectGurgram.StringsProblems;

public class ReverseWordsofString {
    public static void main(String[] args) {

        System.out.println(reveseWords("Hello World"));
    }

   static String reveseWords(String s) {
        String[] str = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.reverse().toString().trim();

    }


}
