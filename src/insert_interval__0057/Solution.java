package insert_interval__0057;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> resultingIntervals = new ArrayList<>();

        int i = 0;
        for (; i < intervals.length && intervals[i][1] < newInterval[0]; ++i) {
            resultingIntervals.add(intervals[i]);
        }
        for (; i < intervals.length && newInterval[1] >= intervals[i][0]; ++i) {
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
        }
        resultingIntervals.add(newInterval);
        for (; i < intervals.length; ++i) {
            resultingIntervals.add(intervals[i]);
        }
        return resultingIntervals.toArray(new int[resultingIntervals.size()][]);
    }
}
