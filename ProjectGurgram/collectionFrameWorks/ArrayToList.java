package ProjectGurgram.collectionFrameWorks;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] arr = {"Java","C++","Python","GoLang"};

        List<String> list = new ArrayList<>();
        for (String ele : arr){
            list.add(ele);
        }
        System.out.println(list);
    }
}
