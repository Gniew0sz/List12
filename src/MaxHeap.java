
public class MaxHeap {
    /**
     * This constructor turns a randomly ordered array into a max heap
     * @param arr the table to be transformed into a max heap
    */
    private int[] arr;
    public MaxHeap(int[] arr) {
        int n =arr.length;
        for (int i=n/2-1;i>=0;i--) heapify(arr,n,i); //according to the formula for indices of an element in a heap the last element that has children is n/2-1 so there is no point in starting the heapifying process on a different index
        this.arr=arr;
    }

    /**
     * Checks whether a node in a heap is greater than its children. If not it swaps them
     * @param arr the heap
     * @param n the length/last index of the heap
     * @param i the index of the node
     */
    private void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);

            heapify(arr, n, largest);
        }
    }

    /**
     * Swaps any two elements of said indices within an array
     * @param arr the table where swapping takes place
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Returns the heap as an array
     * @return the heap as an array
     */
    public int[] getHeap(){
        return this.arr;
    }

    /**
     * Turns the max heap into a sorted array
     * @return the sorted array
     */
    public int[] heapSort(){
        int n = arr.length;
        for (int i=n-1;i>0;i--) {
            swap(arr,i,0);
            heapify(arr, i, 0);
        }
        return arr;
    }
}
