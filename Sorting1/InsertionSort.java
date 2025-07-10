public class InsertionSort {
    public static void main(String[] args){
        int arr[] = {14,9,15,12,6,8,13};
        int n = arr.length;

        for(int i = 0; i<=n-1; i++){
            int j = i;

            //Right shift elements using swapping
        while(j>0 && arr[j-1]>arr[j]){
            //Swap
        
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;

            j--;
        }

        //Print sorted array
        System.out.println("Sorted array is:");
        for(int num:arr){
            System.out.println(num + " ");
        }
        }
    }
    
}
