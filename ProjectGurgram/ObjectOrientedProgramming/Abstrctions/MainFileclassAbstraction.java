package ProjectGurgram.ObjectOrientedProgramming.Abstrctions;

public class MainFileclassAbstraction {
    public static void main(String[] args) {
        ChildClass ch = new ChildClass();
        ch.career();
        ch.partener();

        SiblingClass sb = new SiblingClass();
        sb.career();
        sb.partener();
    }
}
