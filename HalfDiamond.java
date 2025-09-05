/*
 * Half Diamond bookmark_borderPrint half diamond pattern using '*'. See the example for more details.

Input Format
The first and only line of input contains a single integer N.

Output Format
For the given integer, print the half-diamond pattern.

Constraints
1 <= N <= 50

Example
Input
5

Output
*
**
***
****
*****
****
***
**
*
 */

 import java.io.*;
import java.util.*;

public class HalfDiamond {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=0;i<n-1;i++){
        for(int j=n-1-i;j>0;j--){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}