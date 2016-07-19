import java.util.Scanner;

/**
 * Created by Rishi on 19/07/16.
 */
public class insertionSort {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        insertionSort obj = new insertionSort();
        int n;
        System.out.println("enter size of array");
        n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the  " + i + " element");

            a[i] = in.nextInt();
        }

        obj.insertionSort_f(a);
    }

    public void insertionSort_f(int a[]) {

        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > min) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = min;

        }


        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
