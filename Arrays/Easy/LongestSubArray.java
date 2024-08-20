import java.util.*;

public class LongestSubArray
{
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int n = arr.length;

        System.out.println(lenOfLongSubarr(arr,n,k));

    }

    static int lenOfLongSubarr (int arr[], int n, int k)
    {
        n = arr.length;
        Map<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for(int i = 0; i<n; i++)
        {
            sum = sum + arr[i];

            if(sum == k)
            {
                maxLen = Math.max(maxLen, i+1);
            }

            long rem = sum - k;

            if(preSumMap.containsKey(rem))
            {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }

            if(!preSumMap.containsKey(sum))
            {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}
