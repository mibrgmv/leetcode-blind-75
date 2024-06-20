package non_overlapping_intervals__0435;

import java.util.Arrays;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 2) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int r = intervals[0][1];
        int overlappingCount = 0;

        for (int i = 1; i < intervals.length; ++i) {
            int x = intervals[i][0];
            int y = intervals[i][1];
            if (x < r) {
                ++overlappingCount;
            }
            if (x >= r || (x < r && y < r)) {
                r = y;
            }
        }

        return overlappingCount;
    }
}
