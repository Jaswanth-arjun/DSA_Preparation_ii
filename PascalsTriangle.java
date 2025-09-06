/*
Given an index k, return the kth row of the Pascal's triangle.
Pascal's triangle: To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.

Example:

Input : k = 3


Return : [1,3,3,1]

Note: k is 0 based. k = 0, corresponds to the row [1]. 

Note: Could you optimize your algorithm to use only O(k) extra space?
*/


public class Solution {
    public ArrayList<Integer> getRow(int A) {
     ArrayList<Integer> row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=A;i++){
            for(int j=i-1;j>0;j--){
                row.set(j,row.get(j)+row.get(j-1));
            }
            row.add(1);
        }
        return row;
    }
}
