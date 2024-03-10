package Array;

public class _RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5};
        int count = removeDuplicat(arr);
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicat(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
