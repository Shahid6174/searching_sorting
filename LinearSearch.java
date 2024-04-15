public class LinearSearch {

    private int n;

    public LinearSearch(int n) {
        this.n = n;
    }

    public void search(int[] arr, int key) {
        int i;
        for(i=0; i<n; i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Key found at " + (i+1) + " position.");
                return;
            }
        }
        System.out.println("Key not found.");
    }
}
