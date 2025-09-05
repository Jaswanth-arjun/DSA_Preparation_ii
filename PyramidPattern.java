/*
 * Pyramid Pattern bookmark_borderPrint pyramid pattern using '*'. See the example for more details.

Input Format
The first and only line of input contains a single integer N - the size of the pyramid.

Output Format
For the given integer, print the pyramid pattern.

Constraints
1 <= N <= 50

Example
Input5
Output    *
   ***
  *****
 *******
*********
 */

 import java.io.*;
import java.util.*;

public class PyramidPattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n+i;j++){
            if(j<n-1-i){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
    }
}