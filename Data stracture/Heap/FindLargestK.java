import java.util.Arrays;

public class FindLargestK {

    public static int[] findLargest(int[] arr, int k) {
        MaxHeap maxHeap = new MaxHeap(arr.length);

        for (int num : arr) {
            maxHeap.insert(num);
        }

        int[] maxK = new int[k];
        for (int i = 0; i < k; i++) {
            maxK[i] = maxHeap.extractMax();
        }

        return maxK;
    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;
        int[] result = findLargest(nums, k);
        System.out.println(Arrays.toString(result));
    }
}