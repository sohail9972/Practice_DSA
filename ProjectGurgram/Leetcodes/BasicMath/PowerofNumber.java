package ProjectGurgram.Leetcodes.BasicMath;

public class PowerofNumber {
    public static void main(String[] args) {
        System.out.println(powerOfBaseNumber(2, -2));
    }

    public static double powerOfBaseNumber(double a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b<0){
            b=-b;
//            a=1/a;
            return 1/powerOfBaseNumber(a,b);
        }
        if (b%2==0){
        double pow = powerOfBaseNumber(a, b / 2);
        return pow * pow;
    }
        else{
        return a * powerOfBaseNumber(a, b - 1);
    }
}
}

