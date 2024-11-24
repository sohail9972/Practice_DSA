package ProjectGurgram.collectionFrameWorks.Generics;

public class GenericMethods {
    public static void main(String[] args) {
        Integer [] arr = {10,12,15,13,10,84};
        String [] StrArr = {"a","b","c","d","e"};

        System.out.println("printing the numbers");
        printArray(arr);

        System.out.println("prointing the String Values");
        printArray(StrArr);

    }

    public static <E> void printArray(E[] elements){
        for (E ele : elements){
            System.out.println(ele);
        }
        System.out.println();
    }
}
