import java.util.Scanner;

/**
 * Created by Rishi on 19/07/16.
 */
public class bubbleSort {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        bubbleSort obj = new bubbleSort();
        int n;
        System.out.println("enter size of array");
        n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the  " + i + " element");

            a[i] = in.nextInt();
        }

        obj.bubbleSort_f(a);
    }

    public void bubbleSort_f(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k]);
        }

    }
}
