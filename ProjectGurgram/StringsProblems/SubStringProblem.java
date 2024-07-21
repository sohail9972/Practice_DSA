package ProjectGurgram.StringsProblems;

public class SubStringProblem {


    public static void main(String[] args) {
        String str = "Hello";
//        System.out.println(SubString(str));
//        SubString(str);
        subStringByTwoPointer(str);
    }

    public static void SubString(String str) {
int count=0;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
//                str.substring(i,j);
                count++;

                System.out.println(str.substring(i,j));
            }
        }
        System.out.println(count);
//        return str;
    }

//    using the Two Pointer Method

    public static void subStringByTwoPointer(String s){

       StringBuilder str = new StringBuilder(s);
        System.out.println(str.substring(0,5));

    }
}
