import java.util.Arrays;

public class BinarySearch
{
    private int n;
    
    public BinarySearch(int n) {
        this.n = n;
    }

    public void search(int[] arr, int key) {
        
        Arrays.sort(arr);

        int low = 0;
        int high = n-1;

        while (low<=high) 
        {
            int mid = (low+high)/2;

            if(key==arr[mid])
            {
                System.out.println("Key found at " + (mid+1) + " position");
                return;
            }
            else if(key<arr[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        System.out.println("Key not found");
    }
}
