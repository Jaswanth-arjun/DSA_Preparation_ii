/*
Input 1:
A = [3, 4, 1, 4, 2]
Input 2:
A = [1, 2, 3]
Input 3:
A = [3, 4, 1, 4, 1]


Example Output
Output 1:
4
Output 2:
-1
Output 3:
1
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
    for(int i=0;i<A.size()-1;i++){
        for(int j=i+1;j<A.size();j++){
            if(A.get(i).equals(A.get(j))){
                return A.get(i);
                //break;
            }
            
        }
    }
    return -1;
    }
}



optimal:-



import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : A) {
            if (seen.contains(num)) {
                return num;  // first repeated number
            }
            seen.add(num);
        }
        return -1; // no repetition
    }
}




  
