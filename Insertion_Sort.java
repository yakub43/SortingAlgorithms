import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void InsertionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
