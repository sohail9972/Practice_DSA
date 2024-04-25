package ProjectGurgram.StringsProblems;

public class String4 {
    public static void main(String[] args) {
        String[] arr = {"File", "name"};
        reveseArrayofStrings(arr);
    }

    static void reveseArrayofStrings(String[] str){
        for (int i=0;i<str.length;i++){
            String s = str[i];
            char[] c =s.toCharArray();
            int start=0; int last=s.length()-1;
            while(start<=last){
                char temp=c[start];
                c[start] = c[last];
                c[last]=temp;

                start++;
                last--;
            }
        }

        for(int j = 0; j < str.length; j++){
            System.out.println(str[j]);
        }
    }
}