import java.util.Arrays;
import java.util.HashMap;

public class TwoSum
{
    public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] arr, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<arr.length; i++)
        {
            int moreNeeded = target - arr[i];

            if(map.containsKey(moreNeeded))
            {
                return new int[] {map.get(moreNeeded),i};
            }
            map.put(arr[i],i);
        }
        return null;
    }
}