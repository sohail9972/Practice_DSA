package ProjectGurgram.SwiggyTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
   // arr []= odd int
        //duplicate , unsrted ,Remove duplicate
        int [] arr ={1,1,4,4,5,7,6};
        System.out.println( unsortedWithoutDuplicate(arr));

    }

    public static Map<Integer, Integer> unsortedWithoutDuplicate(int [] arr){

        LinkedHashMap<Integer,Integer> lmap = new LinkedHashMap<>();
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=arr[i+1]){
                lmap.put(i,arr[i]);
            }
        }
        return lmap;

//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]!=arr[i+1]){
//                map.put(i,arr[i]);
//            }
//        }
//        return map;

    }


//        Set<Integer> swiggy_list=new HashSet<>();
//
////        for (int i=0;i<arr.length;i++){
////            if (arr[i]!=arr[i+1]){
////                swiggy_list.add(arr[i]);
////            }
////        }
////        return swiggy_list;
////    }
////[]
//    for (int i=0;i<arr.length;i++){
//        for (int j=i;j<arr.length;j++){
//            if (arr[i]!=arr[j-i]){
//                swiggy_list.add(arr[i]);
//            }
//        }
//
//    }
//        return swiggy_list;
//}
}
