class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit = 0;
        int minSofar = arr[0];
        
        for(int i=0 ; i<arr.length ; i++){
            minSofar = Math.min(minSofar ,arr[i]);
            int profit = arr[i] - minSofar;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
