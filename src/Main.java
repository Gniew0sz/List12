import java.util.Scanner;

void main() {
    int n;

    System.out.println("Enter the length of your array: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = (int)(Math.random()*100);
    }
    System.out.println("Your array: "+Arrays.toString(arr));
    MaxHeap heap = new MaxHeap(arr);
    System.out.println("Your array as a heap: "+Arrays.toString(heap.getHeap()));
    System.out.println("Your array after sorting: "+Arrays.toString(heap.heapSort()));

}
