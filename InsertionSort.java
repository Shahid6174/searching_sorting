public class InsertionSort
{
    InsertionSort(int[] arr, int n)
    {
        for(int i = 1; i<n; i++)
        {
            int hole = i;
            int value = arr[i];
            while(hole>0 && arr[hole-1]>value)
            {
                arr[hole] = arr[hole-1];
                hole -= 1;
            }   
            arr[hole] = value;
        }
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}