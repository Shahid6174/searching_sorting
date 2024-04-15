import java.util.Arrays;

public class InterpolationSearch {

    private int n;
    public InterpolationSearch(int n) {
        this.n = n;
    }

    public void search(int[] arr, int key) {
        int pos;
        int low = 0;
        int high = n-1;

        Arrays.sort(arr);
        pos = low + ((key - arr[low])/(arr[high] - arr[low]))*(high-low);

        if(key==arr[pos])
        {
            System.out.println("Key found at " + (pos+1) + " position");
        }
        else
        {
            System.out.println("Key not found");
        }
    }

}
