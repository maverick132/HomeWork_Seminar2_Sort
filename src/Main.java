import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayGenerate arrayGenerateMerge = new ArrayGenerate();
        ArrayGenerate arrayGenerateHeap = new ArrayGenerate();
        arrayGenerateMerge.FillArray(10);
        arrayGenerateHeap.FillArray(10);

        System.out.println("Array for Merge sort:");
        arrayGenerateMerge.PrintArray();
        System.out.println("Merge sort:");
        arrayGenerateMerge.setArrayList(MergeSort.mergeSort(arrayGenerateMerge.getArrayList()));
        arrayGenerateMerge.PrintArray();

        System.out.println("Array for Heap sort:");
        arrayGenerateHeap.PrintArray();
        System.out.println("Heap sort:");
        arrayGenerateHeap.setArrayList(HeapSort.heapSort(arrayGenerateMerge.getArrayList()));
        arrayGenerateHeap.PrintArray();
    }
}