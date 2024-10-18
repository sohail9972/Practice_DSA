package ProjectGurgram.ObjectOrientedProgramming.Rakuten;

class GenricClassfile <T extends ShapesDesign> {
    private T shape;
    public void addShape(T shape){
        this.shape=shape;
    }

    public T getShape(){
        return shape;
    }
}
