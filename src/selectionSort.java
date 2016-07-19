import java.util.Scanner;

/**
 * Created by Rishi on 19/07/16.
 */
public class selectionSort {
    public void selectionSort_f(int a[])
    {


        for(int i=0;i<a.length-1;i++)
        {
        int min_index=i;
            for(int j=i+1;j<a.length;j++) {
                if (a[j] < a[min_index])
                    min_index = j;
            }

                int temp = a[min_index];
                a[min_index] = a[i];
                a[i]=temp;

        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        selectionSort obj=new selectionSort();
        int n;
        System.out.println("enter size of array");
        n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the  "+i+" element");

            a[i]=in.nextInt();
        }

        obj.selectionSort_f(a);
    }
}
