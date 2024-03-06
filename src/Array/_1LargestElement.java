package Array;

public class _1LargestElement {
    public static void main(String[] args) {
        int [] arr={1,2,3,45,7,8};
        int max=largestEle(arr);
        System.out.print(max);

    }

    public static  int largestEle(int[] arr)
    {
        int max=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

}
