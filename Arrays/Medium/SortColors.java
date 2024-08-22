import java.util.Arrays;

public class SortColors
{
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sortColors(int[] arr)
    {
        int zeroes = 0;
        int ones = 0;

        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] == 0)
            {
                zeroes++;
            }
            else if(arr[i] == 1)
            {
                ones++;
            }
        }

        for(int i = 0; i<zeroes; i++)
        {
            arr[i] = 0;
        }
        for(int i = zeroes; i<zeroes+ones; i++)
        {
            arr[i] = 1;
        }

        for (int i = zeroes+ones; i<arr.length; i++)
        {
            arr[i] = 2;
        }
    }
}
