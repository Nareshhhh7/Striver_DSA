public class CheckIfSortedAndRotated
{
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(check(arr));
    }

    static boolean check(int[] arr)
    {
        int n = arr.length;
        int count = 0;

        for(int i = 0; i<n; i++)
        {
            if(arr[i] > arr[(i+1)%n])
            {
                count++;
            }
        }
        if(count > 1)
        {
            return false;
        }
        return true;
    }
}
