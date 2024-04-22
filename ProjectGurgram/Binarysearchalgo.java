package ProjectGurgram;

public class Binarysearchalgo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,1};
        int tar=100;
        int sna=binsearch(arr,tar);
        System.out.println(sna);
    }
    static int binsearch(int arr[],int tar){
        int s=0; int l=arr.length-1;


        while(s<=l){
            int mid=s+(l-s)/2;

            if(tar<arr[mid]){
              l=mid-1;
            } else if (tar>arr[mid]) {
                s=mid+1;
            }else {
                return mid;
            }
        }
        return -1;

    }
}
