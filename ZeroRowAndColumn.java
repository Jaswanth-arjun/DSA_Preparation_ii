/*
 * Zero Row and Zero Column bookmark_borderGiven a matrix A of size N x M. Elements of the matrix are either 0 or 1. If A[i][j] = 0, set all the elements in the ith row and jth column to 0. Print the resultant matrix.

Input Format
The first line of input contains N, M - the size of the matrix A. It is followed by N lines each containing M integers - elements of the matrix.

Output Format
Print the resultant matrix.

Constraints
1 <= N, M <= 100
A[i][j] ∈ {0,1}

Example
Input
4 5
0 1 1 0 1 
1 1 1 1 1 
1 1 0 1 1 
1 1 1 1 1 

Output
0 0 0 0 0 
0 1 0 0 1 
0 0 0 0 0 
0 1 0 0 1 
 */

 import java.io.*;
import java.util.*;

public class ZeroRowAndColumn {

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
    }
    int[][] b=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            
                b[i][j]=1;
            
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==0){
                for(int k=0;k<m;k++){
                    b[i][k]=0;
                }
                 for(int k=0;k<n;k++){
                    b[k][j]=0;
                }
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(b[i][j]+" ");
        }
        System.out.println();
    }
    }
}