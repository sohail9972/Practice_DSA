package ProjectGurgram.ObjectOrientedProgramming.AccessModifiers;

public class firstClass {


    private int num;
    String name;
    int[] arr;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public firstClass(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
}
