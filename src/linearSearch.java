/**
 * Created by Rishi on 18/07/16.
 */
import java.util.*;
class linearSearch
{
    public Boolean linearSearch_f(int a[],int x)
    {
        Boolean f=false;
        for (int i=0;i<a.length;i++ ) {
            if(a[i]==x)
            {
                f=true;
                break;
            }

        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        linearSearch obj=new linearSearch();
        int n;
        System.out.println("enter size of array");
        n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the  "+i+" element");

            a[i]=in.nextInt();
        }
        System.out.println("element to search");
        int x=in.nextInt();
        System.out.println(obj.linearSearch_f(a,x));
    }
}