public class SelectionSort {
    SelectionSort(int arr[], int n)
    {
        for(int i = 0; i<n; i++)
        {
            int minPos = i;
            for(int j = i+1; j<n; j++)
            {
                if(arr[j]<arr[minPos])
                {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
