package ProjectGurgram.ObjectOrientedProgramming.AccessModifiers;

public class ObjectClass {

    public ObjectClass() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
