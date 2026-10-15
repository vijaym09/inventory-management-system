import java.util.*;

public class W {
    public static List<Integer> wavePrintMatrix(int[][] matrix, int m, int n) {
        List<Integer> result = new ArrayList<>();

        // Traverse column-wise
        for (int col = 0; col < n; col++) {

            if (col % 2 == 1) {
                // Odd column: bottom to top
                for (int row = m - 1; row >= 0; row--) {
                    result.add(matrix[row][col]);
                }
            } else {
                // Even column: top to bottom
                for (int row = 0; row < m; row++) {
                    result.add(matrix[row][col]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = wavePrintMatrix(matrix, m, n);
        System.out.println(result);
    }
}