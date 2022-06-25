import java.util.ArrayList;
import java.util.Random;

public class ArrayGenerate {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void FillArray (int lenghtArray){
        Random rd = new Random();
        for (int i = 0; i < lenghtArray; i++) {
            this.arrayList.add(rd.nextInt(100));
        }
    }

    public void PrintArray() {

        for (Object x: this.arrayList) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void PrintArray(ArrayList arrayList) {
        for (Object x: arrayList) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public ArrayList<Integer> CopyArray(){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (Integer integer : this.arrayList) {
            newArray.add(integer);
        }
          return newArray;
        }
    public ArrayList<Integer> CopyArray(ArrayList<Integer> newArray){
        for (Integer integer : this.arrayList) {
            newArray.add(integer);
        }
        return newArray;
    }
    public static ArrayList<Integer> CopyArray(ArrayList<Integer> newArray, ArrayList<Integer> oldArray){
        for (Integer integer : oldArray) {
            newArray.add(integer);
        }
        return newArray;
    }
    public ArrayList<Integer> CopyArray(int startIndex, int endIndex){
        ArrayList<Integer> newArray = new ArrayList<>();
         for (int i = startIndex; i < endIndex +1; i++) {
            newArray.add(this.arrayList.get(i));
        }
          return newArray;
        }
        public ArrayList<Integer> CopyArray(ArrayList<Integer> newArray, int startIndex, int endIndex){
        for (int i = startIndex; i < endIndex +1; i++) {
            newArray.add(this.arrayList.get(i));
        }
          return newArray;
        }
        public static ArrayList<Integer> CopyArray(ArrayList<Integer> newArray, ArrayList<Integer> oldArray, int startIndex, int endIndex){
        for (int i = startIndex; i < endIndex+1; i++) {
            newArray.add(oldArray.get(i));
        }
          return newArray;
        }
}
