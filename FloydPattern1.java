/*
 * Floyd Pattern - 1 bookmark_borderPrint a right-angled triangle pattern using integers. See the example for more details.

Input Format
The first and only line of input contains a single integer N - the size of the triangle.

Output Format
For the given integer, print the right-angled triangle pattern.

Constraints
1 <= N <= 50

Example
Input
6

Output
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
 */

 import java.io.*;
import java.util.*;

public class FloydPattern1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            c+=1;
            System.out.print(c+" ");
        }
        System.out.println();
    }
    }
}