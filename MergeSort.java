public class MergeSort {
    void MergeSorting(int[] arr)
    {
        if (arr == null || arr.length <= 1)
            return;
        
        int n = arr.length;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        
        for(int i = 0; i < mid; i++)
        {
            left[i] = arr[i];
        }

        for(int i = mid; i < n; i++)
        {
            right[i-mid] = arr[i];
        }

        MergeSorting(left);
        MergeSorting(right);
        merge(arr, left, right);

    }
    
    void merge(int[] c, int[] a, int[] b)
    {
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if(a[i] <= b[j])
            {
                c[k] = a[i];                
                i += 1;
            }
            else
            {
                c[k] = b[j];
                j += 1;
            }
            k += 1;
        }
        
        while(i < m)
        {
            c[k] = a[i];
            k += 1;
            i += 1;
        }        
        
        while(j < n)
        {
            c[k] = b[j]; 
            k += 1;               
            j += 1;
        }        
    }

    public void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
