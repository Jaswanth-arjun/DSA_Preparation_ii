/*
 * Matrix Zig-Zag Traversal bookmark_borderGiven a matrix of size N x M, print the matrix in zig-zag order. Refer example for more details.

Input Format
The first line of input contains N, M - the size of the matrix. It is followed by N lines each containing M integers - elements of the matrix.

Output Format
Print the matrix elements in zig-zag order.

Constraints
1 <= N, M <= 100
-106 <= mat[i][j] <= 106

Example
Input
3 3
5 9 -2
-3 4 1
2 6 1

Output
5 9 -2 1 4 -3 2 6 1
 * 
 */

 import java.io.*;
import java.util.*;

public class MatrixZigZagTraversal {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] arr=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
       // System.out.println();
    }
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(i%2==0){
                System.out.print(arr[i][j]+" ");
            }else{
                
                System.out.print(arr[i][m-1-j]+" ");
            }
            
        }
        //System.out.println();
    }
    }
}