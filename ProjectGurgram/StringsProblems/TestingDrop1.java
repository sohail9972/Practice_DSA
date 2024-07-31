package ProjectGurgram.StringsProblems;

import java.util.HashMap;
import java.util.Map;

public class TestingDrop1 {
    public static void main(String[] args) {
        System.out.println(finduniqueletter("pipes"));
    }
//    Str = "Pipes"
    public static char finduniqueletter(String str){
        int index=-1;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int maxfreq = map.getOrDefault(ch,0);
            map.put(ch,maxfreq+1);
        }
        for(int i=0;i< str.length();i++){
            if(map.get(str.charAt(i))==1){
                index=i;
                break;
            }
        }
        return str.charAt(index);
    }

}
