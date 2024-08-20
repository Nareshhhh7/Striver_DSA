public class LargestElement
{
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println(largestElement(arr));

    }

    static int largestElement(int[] arr)
    {
        int max = arr[0];

        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
