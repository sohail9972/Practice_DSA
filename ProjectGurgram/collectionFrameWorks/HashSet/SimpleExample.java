package ProjectGurgram.collectionFrameWorks.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class SimpleExample {
    public static void main(String[] args) {

//        prints the output without the Order
//        adding the Duplicates
        HashSet<String> set = new HashSet<>();
        set.add("one");
//        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");


        //            removing elements if the Condition matches
        set.removeIf(str -> str.contains("one"));


        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
                    }

    }
}
