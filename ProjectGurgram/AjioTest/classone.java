package ProjectGurgram.AjioTest;

public class classone {
    public static void main(String[] args) {
        reverse("My Name is Sohail");

    }

    public static void reverse(String str){
        String s ="";
        String[] indexedValues=str.split(" ");
        char[] c= str.toCharArray();
        for (int i=0;i<str.length();i++){
           s=c[i]+s;
           for (int j=0;j<indexedValues.length;j++){
               String temp = indexedValues[j];
//               indexedValues[j]=str[str.length()];

           }
            System.out.println(s);
        }

    }
}
