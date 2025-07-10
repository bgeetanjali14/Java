public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        // For passes
        for (int i = n - 1; i >= 1; i--) {
            boolean didSwap = false; // Moved and declared properly

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    didSwap = true;
                }
            }

            // Optimization: If no swaps in a full pass, the array is sorted
            if (!didSwap) {
                break;
            }
        }

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
