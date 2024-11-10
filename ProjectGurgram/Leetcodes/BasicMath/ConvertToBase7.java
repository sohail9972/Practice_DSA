package ProjectGurgram.Leetcodes.BasicMath;

public class ConvertToBase7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(45));
    }
        public static String convertToBase7(int num) {
            if(num==0){
                return "0";
            }
            StringBuilder sb=new StringBuilder();
            boolean flag=false;
            if(num<0){
                flag=true;
            }
            num=Math.abs(num);
            while(num>0){
                int rem=num%7;
                sb.insert(0,rem);
                num/=7;
            }
            if(flag){
                sb.insert(0,'-');
            }
            return sb.toString();

        }

}
