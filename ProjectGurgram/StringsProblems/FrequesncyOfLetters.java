package ProjectGurgram.StringsProblems;

import java.util.HashMap;
import java.util.Map;

public class FrequesncyOfLetters {
    public static void main(String[] args) {

    }

    public static String frequencyOfLetters(String s){
        Map<Character, String> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (char c : ch){
            if (Character.isLetter(c)){
//                map.put(c,map.getOrDefault(c)+1);
            }
        }
        return null;
    }
}
