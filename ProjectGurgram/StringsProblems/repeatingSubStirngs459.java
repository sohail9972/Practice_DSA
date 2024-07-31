package ProjectGurgram.StringsProblems;

public class repeatingSubStirngs459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aba"));
    }
    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i=len/2;i>=1;i--){
            if (len%i==0){
                int nums_of_repeats = len /i;
                String st = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for (int j=0;j<nums_of_repeats;j++){
                    sb.append(st);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
