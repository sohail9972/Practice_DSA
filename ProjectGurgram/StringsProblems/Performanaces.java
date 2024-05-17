package ProjectGurgram.StringsProblems;

public class Performanaces {
    public static void main(String[] args) {
        String series = "";
        for (int i=0;i<26 ;i++){
            char ch = (char)('a'+i);
            series=series + ch;

            System.out.println(ch);
        }
        System.out.println(series);
    }
}
