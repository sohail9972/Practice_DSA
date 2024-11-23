package ProjectGurgram.collectionFrameWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();

        list.add("mango");
        list.add("watermelon");
        list.add("pineapple");
        list.add("butterFruit");


        String [] arr = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(arr));

    }
}
