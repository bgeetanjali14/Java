public class SelectionSort{
    public static void main(String args[]){
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;

        for(int i = 0; i<= n-2; i++){
            int min = i;                                      


          //find the index of smallest element
            for(int j = i; j<=n-1; j++){
                if (arr[j]<arr[min]){
                    min = j;  //i is not minimum now,j is minimum
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        //Print Sorted array
        for (int num:arr){
            System.out.println(num + " ");
        }

        
    }

}