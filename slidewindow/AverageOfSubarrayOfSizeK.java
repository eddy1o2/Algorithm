package slidewindow;

import java.util.Arrays;

// Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
// Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
// Output: [2.2, 2.8, 2.4, 3.6, 2.8]
public class AverageOfSubarrayOfSizeK {

    public static void main(String[] args) {
        int[] input = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] output = new double[input.length - k + 1];
        double winSum = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < input.length; winEnd++) {
            winSum += input[winEnd];
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (winEnd >= k-1) {
                output[winStart] = winSum / k;
                winSum -= input[winStart];
                winStart++;
            }
        }
        System.out.println("Output=" + Arrays.toString(output));
    }

}