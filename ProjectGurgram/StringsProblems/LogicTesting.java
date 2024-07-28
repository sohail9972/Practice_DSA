package ProjectGurgram.StringsProblems;

import java.util.List;

public class LogicTesting {
    public static void main(String[] args) {
        logicBehaviour("sohail");
    }
    public static void logicBehaviour(String s){
        StringBuilder sb = new StringBuilder(s);
        System.out.println(new String(sb.chars().sorted().toString()));
    }
}
