import java.util.Scanner;

import javax.sound.sampled.Line;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        

        System.out.println("Which operation do you want to perform?");
        System.out.println("1.Searching or 2.Sorting");
        int opPerf = sc.nextInt();

        if(opPerf==1)
        {
            System.out.println("Enter the key to search for:");
            int key = sc.nextInt();

            label1:
            while(true)
            {
                System.out.println("Select 1.Linear  2.Binary  3.Interpolation");
                int choice = sc.nextInt();

                if(choice==1)
                {
                    LinearSearch ls = new LinearSearch(n);
                    ls.search(arr, key);
                    return;
                }
                else if(choice==2)
                {
                    BinarySearch bs = new BinarySearch(n);
                    bs.search(arr, key);
                    return;
                }
                else if(choice==3)
                {
                    InterpolationSearch is = new InterpolationSearch(n); //Only for uniformly distributed arrays
                    is.search(arr, key);
                    return;
                }
                else
                {
                    System.out.println("Enter vald choice.");
                    continue label1;
                }
            }
        }
        else
        {
            System.out.println("Enter your sorting choice.");
            System.out.println("1.Selection 2.Insertion 3.Bubble 4.Merge 5.Quick");
            int sortChoice = sc.nextInt();

            switch (sortChoice) {
                case 1: SelectionSort ss = new SelectionSort(arr, n);
                        return;
                case 2: InsertionSort is = new InsertionSort(arr, n);
                        return;
                case 3: BubbleSort bs = new BubbleSort(arr, n);
                        return;
                case 4:MergeSort ms = new MergeSort();
                        ms.MergeSorting(arr);
                        ms.printArray(arr);
                        return;
                case 5:QuickSort qs = new QuickSort();
                        qs.quickSorting(arr, 0, arr.length-1);
                        qs.printArray(arr);
                        return;
                default:return;

            }
        }
        
    }
}


