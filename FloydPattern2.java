/*
 * Floyd Pattern - 2 bookmark_borderPrint a right-angled triangle pattern. See the example for more details.

Input Format
The first and only line of input contains a single integer N - the size of the triangle.

Output Format
For the given integer, print the right-angled triangle pattern.

Constraints
1 <= N <= 50

Example
Input
5

Output
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */

 import java.io.*;
import java.util.*;

public class FloydPattern2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=n-1;
    
    for(int i=0;i<n;i++){
        int dig=i+1;
        for(int j=0;j<=i;j++){
            System.out.print(dig+" ");
            dig+=num-j;
        }
        System.out.println();
    }
    }
}