import java.util.Arrays;

public class RotateImage
{
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    static void rotate(int[][] matrix)
    {
        int n = matrix.length;
        int[][] arr = new int[n][n];

        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                arr[j][(n-1)-i] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
