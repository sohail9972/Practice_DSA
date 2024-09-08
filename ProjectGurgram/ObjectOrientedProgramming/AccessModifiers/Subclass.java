package ProjectGurgram.ObjectOrientedProgramming.AccessModifiers;

public class Subclass extends firstClass {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(45,"kd");
        String newname= obj.name;
    }
}
