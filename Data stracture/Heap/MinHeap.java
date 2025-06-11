public class MinHeap {
    private int[] arr;
    private int size;

    public MinHeap(int arrSize) {
        arr = new int[arrSize + 1];
        size = 0;
    }

    public String insert(int key) {
        if (size >= arr.length - 1) {
            return "Not Possible";
        }
        size++;
        arr[size] = key;
        swim(size);
        return "Inserted";
    }

    private void swim(int indx) {
        if (indx <= 1) return;
        int pIdx = indx / 2;
        if (arr[pIdx] > arr[indx]) {
            swap(pIdx, indx);
            swim(pIdx);
        }
    }

    public int extractMin() {
        if (size == 0){
            System.out.print("Heap is empty");
        return 0;
        }
        int temp = arr[1];
        arr[1] = arr[size];
        arr[size] = 0;
        size--;
        sink(1);
        return temp;
    }

    private void sink(int indx) {
        while (2 * indx <= size) {
            int left = 2 * indx;
            int right = 2 * indx + 1;
            int smallest = left;
            if (right <= size && arr[right] < arr[left]) {
                smallest = right;
            }

            if (arr[indx] > arr[smallest]) {
                swap(indx, smallest);
                indx = smallest;
            } else {
                break;
            }
        }
    }

    public void sort() {
        int originalSize = size;
        for (int i = size; i > 1; i--) {
            swap(1, i);
            size--;
            sink(1);
        }
        size = originalSize;
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
        MinHeap heap = new MinHeap(10);
        heap.insert(7);
        heap.insert(5);
        heap.insert(3);
        heap.extractMin();
        heap.printHeap();
    }
}