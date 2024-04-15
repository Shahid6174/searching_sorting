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
}


