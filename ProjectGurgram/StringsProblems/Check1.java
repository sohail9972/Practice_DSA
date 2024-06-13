package ProjectGurgram.StringsProblems;

public class Check1 {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(str(str));
    }
    static boolean str(String s){
        if(s==null || s.length()==0){
            return true;
        }
        s= s.toLowerCase();
        for (int i=0;i<s.length();i++){
            char start = s.charAt(i);
            char last =s.charAt(s.length()-1-i);

            if(start!=last){
                return false;
            }
        }
        return true;

    }
}
