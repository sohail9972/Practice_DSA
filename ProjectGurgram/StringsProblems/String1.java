package ProjectGurgram.StringsProblems;

public class String1 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString("hello"));

//        System.out.println(ams);

    }

    public static String reverseString(String s){

        char[] n=s.toCharArray();
        int start =0; int last=n.length-1;

        while(start<last){
            if (!isVowel(n[start])){
                start++;
            } else if (!isVowel(n[last])) {
                last--;
            }
            else{
                char temp=n[start];
                n[start]=n[last];
                n[last]=temp;
                start++;
                last--;
            }
        }
        return String.valueOf(s);

    }

    static boolean isVowel(char c){
        if (c=='a'|| c=='A' || c=='E'||c=='e'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
            return true;
        }
        return false;
    }
}
