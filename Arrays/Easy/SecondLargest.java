public class SecondLargest
{
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,2};
        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr)
    {
        int first = arr[0];
        int second = Integer.MIN_VALUE;

        for(int i = 1; i<arr.length;i++)
        {
            if(arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] < first)
            {
                second = arr[i];
            }
        }
        return second;
    }
}
