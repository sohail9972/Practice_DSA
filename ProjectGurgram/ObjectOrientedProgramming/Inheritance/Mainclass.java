package ProjectGurgram.ObjectOrientedProgramming.Inheritance;

import javax.swing.Box;

public class Mainclass {
    public static void main(String[] args) {
//        Customized Classed defined as Per the User need

        BoxBase b = new BoxBase();
        System.out.println(b.l + " " + b.w + " " + b.h);

//        getting all Parent Features accessed through the Child Class

        BoxWeightFeature bw = new BoxWeightFeature(2,1,6,5);
        System.out.println(bw.weight + " " + bw.h);


//        Here the Type of Refrence Variable(Parent Class Variables) will Determine what sort of the Elements can be Fetched not the Refrence Object(Child class Object)
        BoxBase b1 = new BoxWeightFeature(2,3,46,4);

//        System.out.println(b1.weight);
    }
}
