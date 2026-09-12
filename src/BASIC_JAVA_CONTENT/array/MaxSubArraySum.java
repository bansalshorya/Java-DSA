package array;

public class MaxSubArraySum {
    static void main() {
            int arr[]={1,-2,4,3,-1};
            int k=3;
            int sum = 0;

            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }

            int maxSum = sum;

            for (int i = k; i < arr.length; i++) {
                sum = sum - arr[i - k] + arr[i];
                maxSum = Math.max(maxSum, sum);
            }
        System.out.println(maxSum);
    }
}
