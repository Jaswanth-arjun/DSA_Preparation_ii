/*
 * Multiplication Table bookmark_borderPrint the multiplication table for the given integer - N.

Input Format
The first and only line of input contains a single integer N.

Output Format
Print multiplication table for given integer N.

Constraints
-105 <= N <= 105

Example
Input
9

Output
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
9 * 10 = 90

 */

 import java.io.*;
import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(n+" * "+i+" = "+n*i);
    }
    }
}