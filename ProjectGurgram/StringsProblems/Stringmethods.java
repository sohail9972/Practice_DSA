package ProjectGurgram.StringsProblems;

import java.util.Arrays;

public class Stringmethods {
    public static void main(String[] args) {
        String name = "sohil hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        name.length();
        System.out.println(name.indexOf('o'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
