package ProjectGurgram.ObjectOrientedProgramming.Inheritance;

public class BoxWeightFeature extends BoxBase{


    double weight;
    public BoxWeightFeature() {
        this.weight = -1;
    }

    public BoxWeightFeature(double l, double w, double h, double weight) {
        super(l, w, h);    // this is calling the Parent Class Constructor , if the that constructor Missing out this Will lead to Error
//        Super Will not be Able to Access the Private Elements of the class
        this.weight = weight;
    }
}
