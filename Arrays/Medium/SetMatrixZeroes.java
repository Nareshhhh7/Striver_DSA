import java.util.Arrays;
public class SetMatrixZeroes
{
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},
                {1,0,1},
                {1,1,1}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    static void setZeroes(int[][] matrix)
    {
        int n = matrix.length; // number of rows
        int m = matrix[0].length; //number of cols

        int[] row = new int[n];
        int[] col = new int[m];

        for(int i = 0; i<n; i++)
        {
            for (int j = 0; j<m ; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i<n; i++)
        {
            for (int j = 0; j<m ; j++)
            {
                if(row[i] == 1 || col[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
