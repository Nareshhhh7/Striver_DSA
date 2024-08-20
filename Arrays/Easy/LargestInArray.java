public class LargestInArray
{
    public static void main(String[] args)
    {
        int arr[] = {10,30,50,20,70,85,82};
        System.out.println(largestElement(arr));
    }

    static int largestElement(int[] arr)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}