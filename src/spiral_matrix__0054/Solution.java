package spiral_matrix__0054;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        List<Integer> a = new ArrayList<>();
        int l = 0, r = m - 1, u = 0, d = n - 1, i;
        while (l <= r && u <= d) {
            for (i = l; i <= r; ++i) {
                a.add(matrix[u][i]);
            }
            ++u;
            for (i = u; i <= d; ++i) {
                a.add(matrix[i][r]);
            }
            --r;
            if (u <= d) {
                for (i = r; i >= l; --i) {
                    a.add(matrix[d][i]);
                }
                --d;
            }
            if (r >= l) {
                for (i = d; i >= u; --i) {
                    a.add(matrix[i][l]);
                }
                ++l;
            }
        }
        return a;
    }
}
