package ProjectGurgram.ObjectOrientedProgramming.BoundTypes;

public class GenericMainFile <T extends ParentClass>{
    private T ParentClass;

    public void addOne(T ParentClass){
        this.ParentClass=ParentClass;
    }
    public T getParentClass(){
        return ParentClass;
    }
}
