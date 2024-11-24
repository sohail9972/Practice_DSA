package ProjectGurgram.collectionFrameWorks.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetFromOtherCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("one");

        HashSet<String> set = new HashSet<>(list);
        set.add("one");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
