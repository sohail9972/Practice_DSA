package ProjectGurgram.ObjectOrientedProgramming.InterfacesLearning;

public class CDPlayers implements MediaPlayers{

    @Override
    public void start() {
        System.out.println("I am media Players");
    }

    @Override
    public void stop() {
        System.out.println("media Player stops");
    }

    @Override
    public void replay() {
        System.out.println("mediap players getting Replayed");
    }
}
