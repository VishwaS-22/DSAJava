package vishwa;

public class MinValue {
    public static void main(String[] args) {
        int[] arr1={11,1,22,2,33,3,44,4,55,5};

        System.out.println(minimum(arr1));
    }
    static int minimum(int[] arr){
        int element=arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] < element) {
               element=arr[i];
            }
        }
        return element;
    }
}
