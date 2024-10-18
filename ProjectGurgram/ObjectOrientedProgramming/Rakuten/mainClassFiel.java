package ProjectGurgram.ObjectOrientedProgramming.Rakuten;

public class mainClassFiel {
    public static void main(String[] args) {
        GenricClassfile<Circle> c= new GenricClassfile<>();
        Circle set = new Circle();
        c.addShape(set);
        c.getShape();
    }

}
