package ProjectGurgram.StringsProblems;

public class firstandLastcharacterReverse {
    public static void main(String[] args) {
        System.out.println(reversefirstandLast("    "));
    }
    public static String reversefirstandLast(String str){
        char [] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++){
            if(ch[i]== ' '){
                return " ";
            }
            int count = i ;
            while(i<ch.length && ch[i] !=' '){
                i++;
            }
            char temp = ch[count];
            ch[count]=ch[i-1];
            ch[i-1]=temp;
        }
        return new String(ch);
    }
}
