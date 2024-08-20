import java.util.*;
public class Union
{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2= {1, 2, 3, 6, 7};
        int n = 5;
        int m = 5;

        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
        {
            System.out.print(val + " ");
        }
    }

    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m)
    {
        int i =0;
        int j = 0;

        ArrayList<Integer> Union = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                {
                    Union.add(arr1[i]);
                }
                i++;
            }
            else // case 3
            {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
            {
                Union.add(arr1[i]);
            }
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }
        return Union;
    }
}
