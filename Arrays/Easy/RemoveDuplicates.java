public class RemoveDuplicates
{
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] arr)
    {
        int newIndex = 1;
        for(int i = 1; i< arr.length; i++)
        {
            if(arr[i] != arr[i-1])
            {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newIndex;
    }
}
