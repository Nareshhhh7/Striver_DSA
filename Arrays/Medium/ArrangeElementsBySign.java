import java.util.Arrays;

public class ArrangeElementsBySign
{
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    static int[] rearrangeArray(int[] arr)
    {
        int evenPos = 0;
        int oddPos = 1;

        int[] ans = new int[arr.length];

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > 0)
            {
                ans[evenPos] = arr[i];
                evenPos = evenPos + 2;
            }
            else if (arr[i] < 0)
            {
                ans[oddPos] = arr[i];
                oddPos = oddPos + 2;
            }
        }
        return ans;
    }
}
