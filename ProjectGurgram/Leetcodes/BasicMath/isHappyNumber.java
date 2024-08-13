package ProjectGurgram.Leetcodes.BasicMath;

import java.util.HashMap;

public class isHappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(1234));
    }
    public static boolean isHappy(int n) {
        int x=n;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        while(n!=1)
        {
            int sum=0;
            while(x!=0)
            {
                int lstdgt=x%10;
                int lstdgtsq=(int)Math.pow(lstdgt,2);
                sum+=lstdgtsq;
                x=x/10;
            }
            if(!hmap.containsKey(sum))
            {
                hmap.put(sum,1);
            }
            else
            {
                return false;
            }
            n=sum;
            x=sum;
        }
        if(n==1)
        {
            return true;
        }
        return false;
    }
}
