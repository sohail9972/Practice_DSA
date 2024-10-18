package ProjectGurgram.ObjectOrientedProgramming.Rakuten.BoundedType;

public class myOwnGenericClass <IsSort> {

    private IsSort element;

    public void myOwnGenericClass(IsSort element){
        this.element= element;
    }

    public void  print(){
        System.out.println("element available for the User created Generic");
    }
}
