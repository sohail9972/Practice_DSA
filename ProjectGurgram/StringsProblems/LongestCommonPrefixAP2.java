package ProjectGurgram.StringsProblems;

public class LongestCommonPrefixAP2 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    static String longestCommonPrefix(String[] strs) {
        if (strs.length ==0) return "";
        String res = strs[0];
        for(int i =1;i< strs.length;i++){
            while(strs[i].indexOf(res)!=0){
                res = res.substring(0,res.length()-1);
            }
        }

        return res;
    }
}
