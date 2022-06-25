public class Main {
    public static void main(String[] args) {
        ArrayGenerate ag = new ArrayGenerate();
        ag.FillArray(10);
        ag.PrintArray();
        System.out.println();
        ag.setArrayList(MergeSort.mergeSort(ag.getArrayList()));
        ag.PrintArray();
    }
}