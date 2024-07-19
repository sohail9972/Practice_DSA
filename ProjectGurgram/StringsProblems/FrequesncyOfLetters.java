package ProjectGurgram.StringsProblems;

import java.util.HashMap;
import java.util.Map;

public class FrequesncyOfLetters {
    public static void main(String[] args) {
        System.out.println(frequencyOfLetters("Sohail"));
    }

    public static String frequencyOfLetters(String s){
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0;i<s.length();i++){
            Character ch = s.charAt(i);

            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        return map.toString();
    }
}
