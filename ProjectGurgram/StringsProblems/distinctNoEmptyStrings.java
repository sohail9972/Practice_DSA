package ProjectGurgram.StringsProblems;

import java.util.HashSet;
import java.util.Set;

public class distinctNoEmptyStrings {
    public static void main(String[] args) {
        System.out.println(distinctnonEmptyStrings("Sohail"));
    }

    public static int distinctnonEmptyStrings(String s){
        Set<String> subStrings = new HashSet<>();
        int n= s.length();

        for (int i=0;i<n;i++){
            for (int j=i+1;j<=n;j++){
                subStrings.add(s.substring(i,j));
            }
        }

        return subStrings.size();
    }
}
