import java.util.Arrays;

public class TaskDistributor {

    public static int[] taskDistributor(int[] tasks, int m) {

        MinHeap machine = new MinHeap(m);
        for (int i = 0; i < m; i++) {
            machine.insert(0);
        }


        for (int task : tasks) {
            int minLoad = machine.extractMin();
            machine.insert(minLoad + task);
        }


        int[] sortedArr = new int[m];
        for (int i = 0; i < m; i++) {
            sortedArr[i] = machine.extractMin();
        }


        sortedArr[m - 1] = sortedArr[m - 1] - 1;
        sortedArr[0] = sortedArr[0] + 1;

        return sortedArr;
    }

    public static void main(String[] args) {
        int[] tasks = {2, 4, 7, 1, 6};
        int m = 4;
        int[] result = taskDistributor(tasks, m);
        System.out.println(Arrays.toString(result));
    }
}