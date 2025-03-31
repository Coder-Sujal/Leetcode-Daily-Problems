class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0;i<n-1;i++){
            arr.add(weights[i] + weights[i+1]);
        }

        Collections.sort(arr);

        long min_sum = 0;
        long max_sum = 0;

        for(int i = 0;i<k-1;i++){
            min_sum += arr.get(i);
            max_sum += arr.get(arr.size() - i - 1);
        }
         
        return max_sum - min_sum;
    }
}