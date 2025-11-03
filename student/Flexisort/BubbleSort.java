package Flexisort;

public class BubbleSort extends Sorter {


    @Override
    public void sort() {
        int[] arr = getArray();
        for (int i = 0; i < arr.length-1;i ++){
            for (int z= 0 ; z < arr.length - i -1; z++){
                if (arr[z] > arr[z+1]){
                    int temp = arr[z];
                    arr[z] = arr[z+1];
                    arr[z+1] = temp;
                }
            }
        }
        setArray(arr);
    }
}
