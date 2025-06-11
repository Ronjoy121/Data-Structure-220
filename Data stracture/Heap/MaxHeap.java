public class MaxHeap {
    private int[] arr;
    private int size;

    public MaxHeap(int arrSize) {
        arr = new int[arrSize + 1]; // index 0 is unused
        size = 0;
    }

    public String insert(int key) {
        if (size + 1 >= arr.length) {
            return "Not Possible";
        }
        arr[++size] = key;
        swim(size);
        return "Inserted";
    }

    private void swim(int indx) {
        int parentIdx = indx / 2;
        if (parentIdx >= 1 && arr[parentIdx] < arr[indx]) {
            swap(parentIdx, indx);
            swim(parentIdx);
        }
    }

    public int extractMax() {
        if (size == 0) {
        System.out.print("Heap is empty");
        return 0;

        }
        int temp = arr[1];
        arr[1] = arr[size];
        arr[size] = 0;
        size--;
        sinkDown(1);
        return temp;
    }

    private void sinkDown(int indx) {
        int left = 2 * indx;
        int right = 2 * indx + 1;

        if (left <= size && right <= size) {
            if (arr[left] > arr[right]) {
                if (arr[indx] < arr[left]) {
                    swap(indx, left);
                    sinkDown(left);
                }
            } else {
                if (arr[indx] < arr[right]) {
                    swap(indx, right);
                    sinkDown(right);
                }
            }
        } else if (left <= size) {
            if (arr[indx] < arr[left]) {
                swap(indx, left);
                sinkDown(left);
            }
        }
    }

    public void sort() {
        int originalSize = size;
        for (int i = size; i > 1; i--) {
            swap(1, i);
            size--;
            sinkDown(1);
        }
        size = originalSize; // restore the heap size
    }

    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            if (i == size) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + "->");
            }
        }
        System.out.println();
    }

    private void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.extractMax();
        heap.printHeap();
    }
}
