package ProjectGurgram.ObjectOrientedProgramming.NestedInterfaces;

public class TestNestedInterfaces {
    public interface nestedInteface{
        boolean isOdd(int num);
    }
}

class Child implements TestNestedInterfaces.nestedInteface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}
