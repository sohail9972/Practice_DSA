package ProjectGurgram.ObjectOrientedProgramming.InterfacesLearning;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }

    @Override
    public void acce() {
        System.out.println("Power Engine Acc");
    }
}
