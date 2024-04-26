public class QuickSort {
    int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; 
        int pivotIdx = start;
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, pivotIdx);
                pivotIdx += 1;
            }
        }
        swap(arr, pivotIdx, end);
        return pivotIdx;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void quickSorting(int[] arr, int start, int end) {   
        if (start < end) {
            int pIdx = partition(arr, start, end);
            quickSorting(arr, start, pIdx - 1);
            quickSorting(arr, pIdx + 1, end);
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
