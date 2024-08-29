package ProjectGurgram.collectionFrameWorks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistsProblems {
    public static void main(String[] args) {

//        ways to iterate the array List
//        iterator
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        using ForEach loop
        for (String numb : list){
            System.out.println(numb);
        }

//        using the Listiterator
//        Needs to Mention the Size of the ArrayList as Capacity
        ListIterator<String> li = list.listIterator(list.size());
        while (li.hasPrevious()){
            String str = li.previous();
            System.out.println(str);

        }

//        using the forEach method
//        New Feature which uses the Lambda Expressions

        list.forEach(a ->{
            System.out.println(a);
        });
        System.out.println(list);
    }
}
