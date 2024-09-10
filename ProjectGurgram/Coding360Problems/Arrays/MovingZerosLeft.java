package ProjectGurgram.Coding360Problems.Arrays;

public class MovingZerosLeft {
    public static void main(String[] args) {
int[] arr = {2,3,0,4,0};
int n=5;

moveZerosToLeft(arr,n);
    }
    public static void moveZerosToLeft(int[] arr, int n)
    {
//        using two pointer method
//        Make Both the Pointer to start from the End of the Array
//        Then Check the Last Indexed Value is Zero or not
//        If the Element is Zero Move your Pointer towards the Left Side(beginning of the Array)
//        If it is not Equal to Zero Perform the Swap Operation
//        Then Decrement the Both The pointers by 1
        int start=n-1;
        int last=n-1;
        while(last>=0){
            if (arr[last]!=0){
                int temp=arr[last];
                arr[last]=arr[start];
                arr[start]=temp;
                start--;
                last--;
            }
            else {
                last--;
            }
        }
    }
}
