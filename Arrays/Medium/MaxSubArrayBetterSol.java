public class MaxSubArrayBetterSol
{
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j = i; j<arr.length; j++)
            {
                sum = sum + arr[j];
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
