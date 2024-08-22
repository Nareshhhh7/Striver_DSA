public class MajorityElement
{
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));

    }

    static int majorityElement(int[] arr)
    {
        int majority = arr[0];
        int votes = 1;

        for(int i = 1; i< arr.length; i++)
        {
            if(votes == 0)
            {
                majority = arr[i];
                votes++;
            }
            else if(majority == arr[i])
            {
                votes++;
            }
            else {
                votes--;
            }
        }
        return majority;
    }
}
