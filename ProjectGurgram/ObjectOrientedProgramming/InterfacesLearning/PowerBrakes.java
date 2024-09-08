package ProjectGurgram.ObjectOrientedProgramming.InterfacesLearning;

public class PowerBrakes implements Brakes{

    @Override
    public void brakes() {
        System.out.println("Power Brakes Applied");
    }
}
