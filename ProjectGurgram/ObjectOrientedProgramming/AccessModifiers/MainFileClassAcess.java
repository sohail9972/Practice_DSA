package ProjectGurgram.ObjectOrientedProgramming.AccessModifiers;

public class MainFileClassAcess {
    public static void main(String[] args) {
        firstClass obj = new firstClass(10,"sohail");

//        able to access the Private Memebers of the class
        obj.getNum();

    }
}
