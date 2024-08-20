public class MissingNum
{
    public static void main(String[] args) {
        int[] arr = {1,0,3};  // 2 is missing
        System.out.println(missingNum(arr));

    }

    static int missingNum(int[] arr)
    {
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i<n; i++)
        {
            sum = sum + arr[i];
        }

        int actualSum = (n*(n+1))/2;
        int missingNum = actualSum - sum;

        return missingNum;
    }
}
