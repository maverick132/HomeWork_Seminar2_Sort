/* Сортировка слиянием - принцип разделяй и властвуй с использованием рекурсии. Разбиваем массив на два одинаковой
* длины. Затем сортируем каждый из них, рекурсивно вызываем этот же метод сортировки для каждого массива, до тех пор
* пока длина массива не станет равна 1. Массивы размер 1 и 0 автоматически отсортированы. После собирается исходный
* массив.  */

import java.util.ArrayList;


public class MergeSort {
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> array){
        if (array == null) return null;
        if (array.size() == 1) return array;

        ArrayList<Integer> leftArray = new ArrayList<>();
        ArrayList<Integer> rightArray = new ArrayList<>();
        ArrayGenerate.CopyArray(leftArray, array, 0, (array.size()/2)-1);
        ArrayGenerate.CopyArray(rightArray, array, (array.size()/2) , array.size()-1);
        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        return MergeArray(leftArray, rightArray);

    }

    public static ArrayList<Integer> MergeArray (ArrayList<Integer> leftArray, ArrayList<Integer> rightArray){
        ArrayList<Integer> resultArray = new ArrayList<>();
        int positionIndexLeftArray = 0;
        int positionIndexRightArray = 0;

        for (int i = 0; i < leftArray.size() + rightArray.size(); i++) {
            if (positionIndexLeftArray == leftArray.size()){ //Если перебрали весь левый массив, смотрим только на правый
                resultArray.add(rightArray.get(positionIndexRightArray));
                positionIndexRightArray++;
            }
            else if (positionIndexRightArray == rightArray.size()) {//Если перебрали весь правый массив, смотрим только на левый
                resultArray.add(leftArray.get(positionIndexLeftArray));
                positionIndexLeftArray++;
            }
            // Если не перебрали полностью ниодин из масивов, сравниваем текущие элементы
            else if (leftArray.get(positionIndexLeftArray) > rightArray.get(positionIndexRightArray)) {
                resultArray.add(rightArray.get(positionIndexRightArray));
                positionIndexRightArray++;
            }
            else {
                resultArray.add(leftArray.get(positionIndexLeftArray));
                positionIndexLeftArray++;
            }
        }
        return resultArray;
    }
}
