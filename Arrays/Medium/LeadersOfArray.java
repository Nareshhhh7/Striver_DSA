import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersOfArray
{
    public static void main(String[] args) {
        int[] arr ={16,17,4,3,5,2};
        System.out.println(leaders(arr.length,arr));
    }

    static ArrayList<Integer> leaders(int n, int[] arr)
    {
        ArrayList <Integer> ans = new ArrayList<Integer>();
        int max = arr[n-1];
        ans.add(max);

        for(int i = n - 2; i>=0; i--)
        {
            if(arr[i]>=max)
            {
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
