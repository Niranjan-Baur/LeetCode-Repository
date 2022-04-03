class Solution {
    public int majorityElement(int[] A) {

        int n = A.length;
        int candidate = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            if(count == 0)
                candidate = A[i];
            if(A[i] == candidate)
                count++;
            else
                count--;
        }

    return candidate;
    }
}
