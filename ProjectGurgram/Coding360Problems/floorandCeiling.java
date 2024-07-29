package ProjectGurgram.Coding360Problems;

public class floorandCeiling {
    public static void main(String[] args) {
        int[] arr = {3 ,4 ,4 ,7 ,8, 10};
        int target = 8;
        int[] ans= floorAdCeil(arr,target);
        System.out.println(ans[0]+" " + ans[1]);
    }
    public static int[] floorAdCeil(int[] arr,int tar) {
        int floor = floorFunction(arr,tar);
        int ceil = ceilingFunction(arr,tar);
        return new int[]{floor,ceil};
    }
//    floor is the smallest or equal to target value
//    ceiling bvalues is the next Largest Value from the Target
//    Ex : [2,5,5,7] if tar = 6 then floor =5 ceil is 7

    public static int floorFunction(int[] arr,int tar){
        int start=0; int last = arr.length-1;
        int ans =-1;
        while(start<=last){
            int mid = start + (last-start)/2;
            if(arr[mid]<=tar){
                ans = arr[mid];
                start=mid+1;
            }else {
                last=mid-1;
            }


            }
        return ans;
    }

    public static int ceilingFunction(int[] arr,int tar){
        int start = 0; int last= arr.length-1;
        int ans = -1;
        while (start<=last) {
            int mid = start + (last - start) / 2;
            if (arr[mid] >= tar) {
                ans = arr[mid];
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
