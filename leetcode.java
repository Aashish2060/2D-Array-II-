public class leetcode {
    public static int secondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        if (secondMax == max) {
            return -1;
        }
        return secondMax;

    }
    public static void main(String[] args){
        int arr[]={1,4,5,7,8,2};
        int result=secondLargest(arr);
        System.out.print(result);

    }
}
