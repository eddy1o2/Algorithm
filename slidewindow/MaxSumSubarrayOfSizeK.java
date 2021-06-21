package slidewindow;


// Given an array of positive numbers and a positive number ‘k,’ 
// find the maximum sum of any contiguous subarray of size ‘k’.
// Input: [2, 1, 5, 1, 3, 2], k=3 
// Output: 9
// Explanation: Subarray with maximum sum is [5, 1, 3].
public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] input = new int[]{2, 1, 5, 1, 3, 2};
        int k = 3;
        int winSum = 0;
        int max = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < input.length; winEnd++) {
            winSum += input[winEnd];
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (winEnd >= k-1) {
                if (winSum > max) {
                    max = winSum;
                }
                winSum -= input[winStart];
                winStart++;
            }
        }
        System.out.println("max=" + max);
    }
}
