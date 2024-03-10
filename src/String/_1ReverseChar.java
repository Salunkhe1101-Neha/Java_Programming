package String;
public class _1ReverseChar {
    public static void main(String[] args) {
        String s="n@#cp";
        char [] arr=s.toCharArray();
        int i=0, j=arr.length-1;
        while (i<=j)
        {
            if(!Character.isAlphabetic(arr[i]))
                i++;

            if(!Character.isAlphabetic(arr[j]))
                j--;

            if(Character.isAlphabetic(arr[i]) && Character.isAlphabetic(arr[j]))
            {
                char temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        String output=new String(arr);
        System.out.println(output);
    }
}
