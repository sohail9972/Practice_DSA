package ProjectGurgram;

public class BinTemplate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,1};
//        int tar=100;
        int sna=binsearch(arr);
        System.out.println(sna);
    }
    static int binsearch(int arr[]){
        int s=0; int l=arr.length-1;
        while (s<l){
            int mid = s + (l-s)/2;
            if (arr[mid]>arr[mid+1]){
                l=mid;
            }
            else {
                s=mid+1;
            }
        }
        return -1;

    }
}
