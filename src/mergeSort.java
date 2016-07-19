import java.util.Scanner;

/**
 * Created by Rishi on 19/07/16.
 */
/*public class mergeSort {
    public void mergeSort(int a[],int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;

        int L[]=new int[n1];
        int R[]=new int[n2];

        for(int i=0;i<n1;i++)
        {L[i]=a[l+1];}
        for(int i=0;i<n2;i++)
        {R[i]=a[m+1+i];}

        int i=0,j=0;
        int k=1;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                a[k]=L[i];
                i++;
            }
            else
            {
                a[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=R[j];
            j++;
            k++;
        }

    }
    public void sort(int a[],int l,int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;
            sort(a,l,m);
            sort(a,m+1,r);

            mergeSort(a,l,m,r);

        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        mergeSort obj = new mergeSort();
        int n;
        System.out.println("enter size of array");
        n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the  " + i + " element");

            a[i] = in.nextInt();
        }
        obj.sort(a,0,a.length-1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }

    }


}
*/
/* Java program for Merge Sort */
class mergeSort {
    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        mergeSort obj = new mergeSort();
        int n;
        System.out.println("enter size of array");
        n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the  " + i + " element");

            a[i] = in.nextInt();
        }
        obj.sort(a, 0, a.length - 1);

        System.out.println("\nSorted array");
        printArray(a);
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
