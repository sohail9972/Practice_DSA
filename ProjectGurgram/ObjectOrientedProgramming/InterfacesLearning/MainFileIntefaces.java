package ProjectGurgram.ObjectOrientedProgramming.InterfacesLearning;

public class MainFileIntefaces {
    public static void main(String[] args) {

//        CarFeature car = new CarFeature();
//        car.acce();
//        car.brakes();
//        car.start();


        MediaPlayers md = new CDPlayers();
        md.start();
        md.replay();
        md.stop();

        Brakes b = new PowerBrakes();
        b.brakes();
    }
}
