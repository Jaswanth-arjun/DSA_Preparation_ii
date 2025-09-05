/*
 * Interchange Diagonals bookmark_borderGiven a matrix A of size NxN, interchange the diagonal elements from top to bottom and print the resultant matrix.

Input Format
First line of input contains N - the size of the matrix. It is followed by N lines each containing N integers - elements of the matrix.

Output Format
Print the matrix after interchanging the diagonals.

Constraints
1 <= N <= 100
1 <= A[i][j] <= 104

Example
Input
4
5 6 7 8
13 14 15 16
1 2 3 4
9 10 11 12

Output
8 6 7 5 
13 15 14 16 
1 3 2 4 
12 10 11 9 

*/

import java.io.*;
import java.util.*;

public class InterchangeDiagonals {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }
   
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j){
            int t=arr[i][j];
            arr[i][j]=arr[i][n-1-j];
            arr[i][n-1-j]=t;
        }}
        
    }
   for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
}