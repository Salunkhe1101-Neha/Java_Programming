package Array;

public class _3CheckSorted {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,4,5,6};
        boolean sts=checkSorted(arr);
        if(sts)
            System.out.print("Array is sorted");
        else
            System.out.print("Array is not sorted");
    }
    public static boolean checkSorted(int [] arr)
    {
        for (int i=1;i< arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {

            }

            else
                return false;
        }

        return true;
    }
}
