package Array;
public class _2SecondLargestElement {
    public static void main(String[] args) {
        int [] arr={1,2,4,6,4,8,10,10,11};
        int secondLarge=secondLarge(arr);
        System.out.println(secondLarge);
    }
    public static int secondLarge(int [] arr)
    {
        int max=arr[0];
        int secondMax=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondMax=max;
                max=arr[i];
            }
            if(arr[i]>secondMax && arr[i]<max)
                secondMax=arr[i];
        }

        return secondMax;
    }
}
