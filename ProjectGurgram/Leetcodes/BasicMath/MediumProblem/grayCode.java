package ProjectGurgram.Leetcodes.BasicMath.MediumProblem;

import java.util.ArrayList;
import java.util.List;

public class grayCode {
    public static void main(String[] args) {
        System.out.println(grayCode(12));
    }
    public static List<Integer> grayCode(int n) {
        ArrayList list=new ArrayList();
        for(int i=0;i<(1<<n);i++){
            list.add(i^(i>>1));
        }
        return list;
    }
}
