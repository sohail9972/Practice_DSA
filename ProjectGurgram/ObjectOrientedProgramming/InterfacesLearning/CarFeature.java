package ProjectGurgram.ObjectOrientedProgramming.InterfacesLearning;

// this Class will have all the functionalties from intefaces that were declared
public class CarFeature implements Engine,Brakes,MediaPlayers{
    @Override
    public void brakes() {
        System.out.println("I am Applying the Brakes");
    }

    @Override
    public void start() {
        System.out.println("i nitiates like rockstars");
    }

    @Override
    public void stop() {
        System.out.println("I stop immediately");
    }

    @Override
    public void replay() {
        System.out.println("Media replayed");
    }

    @Override
    public void acce() {
        System.out.println("Car Accelerates");
    }
}
