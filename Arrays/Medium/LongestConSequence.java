public class LongestConSequence
{
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 2, 3, 4};
        System.out.println(longConSequence(arr));
    }

    static int longConSequence(int[] arr)
    {
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;

        if(arr.length == 0)
        {
            return 0;
        }

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] - 1 == lastSmaller)
            {
                count++;
                lastSmaller = arr[i];
            }

            else if(arr[i] != lastSmaller)
            {
                count = 1;
                lastSmaller = arr[i];
            }
            lastSmaller = Math.max(count,longest);
        }
        return lastSmaller;
    }
}
