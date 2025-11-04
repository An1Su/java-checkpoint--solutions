package Flexisort;

public class InsertionSort extends Sorter {
    @Override
    public void sort() {
        int[] arr = getArray();
        if (arr == null || arr.length == 0) return;
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int z = i -1;
            while (z >= 0 && arr[z]> key){
                arr[z+1] = arr[z];
                z--;
            }
            arr[z+1] = key;
        }
        setArray(arr);
    }
}
