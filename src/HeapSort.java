import java.util.ArrayList;

public class HeapSort {
    public static ArrayList<Integer> heapSort(ArrayList<Integer> array){
        createHeap(array);

        for (int i = array.size()-1; i >=0 ; i--) {
            int data = array.get(0);
            array.add(0,array.get(i));
            array.remove(1);
            array.add(i,data);
            array.remove(i+1);
            heapify(array,i,0);
        }
        return array;
    }

    public static void createHeap(ArrayList<Integer> array){
        for (int i = (array.size()/2) -1; i >=0 ; i--) {
            heapify(array, array.size(), i);
        }
    }

    public static void heapify (ArrayList<Integer> array, int heapSize,int heapPeak ){
        int upper = heapPeak;
        int leftBranch = 2*heapPeak + 1;
        int rightBranch = 2*heapPeak + 2;

        if (leftBranch < heapSize && array.get(upper) < array.get(leftBranch)) upper = leftBranch;
        if (rightBranch < heapSize && array.get(upper) < array.get(rightBranch)) upper = rightBranch;
        if (upper != heapPeak) {
            int data = array.get(heapPeak);
            array.add(heapPeak,array.get(upper));
            array.remove(heapPeak+1);
            array.add(upper,data);
            array.remove(upper + 1);
            heapify(array, heapSize,upper);
        }


    }


}
