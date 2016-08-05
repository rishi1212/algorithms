/**
 * Created by Rishi on 05/08/16.
 */

import java.io.*;
import java.util.*;

public class palindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int flag = 0;
        char a[] = new char[A.length()];
        for (int i = 0; i < A.length(); i++) {
            a[i] = A.charAt(i);
        }

        char b[] = new char[A.length()];
        int j = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        for (int i = 0; i < A.length(); i++) {
            if (a[i] != b[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }
    }
}

