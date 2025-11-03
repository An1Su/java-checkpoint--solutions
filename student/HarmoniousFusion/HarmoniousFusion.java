package HarmoniousFusion;

public class HarmoniousFusion {
    public int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, z = 0, r = 0;

        while (i < arr1.length && z < arr2.length) {
            if (arr1[i] <= arr2[z]) {
                result[r++] = arr1[i++];
            } else {
                result[r++] = arr2[z++];
            }
        }

        while (i < arr1.length) {
            result[r++] = arr1[i++];
        }

        while (z < arr2.length) {
            result[r++] = arr2[z++];
        }

        return result;
    }
}
