package merge_intervals__0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }
        List<int[]> mergedIntervals = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int x = intervals[0][0], y = intervals[0][1];
        for (int j = 1; j < intervals.length; ++j) {
            if (intervals[j][0] <= y) {
                y = Math.max(intervals[j][1], y);
            } else {
                mergedIntervals.add(new int[] { x, y });
                x = intervals[j][0];
                y = intervals[j][1];
            }
        }
        mergedIntervals.add(new int[] { x, y });
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
