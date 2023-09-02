class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(arr);
    }

    public static void bubbleSort(int[] arr){
        boolean swapped = false;
        // run the steps n-1 times
        for(int i = 0; i < arr.length; i++){
            // for each step, max item will come at the last respective index
            for(int j = 1; j <= arr.length - i;j++){
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        }
        // if you did not swap for a particular value of i, it means the array
        // is sorted hence stop the program
        if(!swapped){
            break;
        }
    }
}