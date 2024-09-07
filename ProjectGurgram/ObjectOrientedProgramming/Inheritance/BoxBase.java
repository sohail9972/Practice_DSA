package ProjectGurgram.ObjectOrientedProgramming.Inheritance;

public class BoxBase {
    double l;
    double w;
    double h;

    BoxBase(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    BoxBase(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    BoxBase(double l, double w, double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    BoxBase(BoxBase old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    public void information(){
        System.out.println("Testing the Opps Programming");
    }
}
