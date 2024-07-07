package combination_sum__0039;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int target;
    private int[] candidates;
    private List<List<Integer>> combos = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        this.candidates = candidates;
        solve(new ArrayList<>(), 0, 0);
        return combos;
    }

    private void solve(List<Integer> currentCombo, int currentSum, int index) {
        if (index >= candidates.length || currentSum > target) {
            return;
        }
        if (currentSum == target) {
            combos.add(new ArrayList<>(currentCombo));
            return;
        }
        currentCombo.add(candidates[index]);
        solve(currentCombo, currentSum + candidates[index], index);
        currentCombo.removeLast();
        solve(currentCombo, currentSum, index + 1);
    }
}
