/*
First and Last bookmark_borderYou are given an array A of size N, containing integers. Your task is to find the first and last occurrences of a given element X in the array A and print them.

Input Format
The input consists of three lines. The first line contains a single integer N - the size of the array. The second line contains N integers separated by a space, representing the elements of the array A. The third line contains a single integer X.

Output Format
Print the indexes of the first and last occurrences separated by a space.

Constraints
1 <= N <= 103
1 <= A[i] <= 105
X ∈ A

Example
Input
10
1 3 5 7 9 11 3 13 15 3
3

Output
1 9

*/

import java.io.*;
import java.util.*;

public class FirstAndLast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int x=sc.nextInt();
    int f=-1;
    int l=0;
    for(int i=0;i<n;i++){
        if(arr[i]==x){
            if(f==-1){
                f=i;
            }
            l=i;
        }
    }
    System.out.print(f+" "+l);
    }
}