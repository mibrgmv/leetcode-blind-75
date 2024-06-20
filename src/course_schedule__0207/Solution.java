package course_schedule__0207;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        var G = new Graph(numCourses);
        for (int[] edge : prerequisites) {
            G.addEdge(edge[1], edge[0]);
        }
        for (int i = 0; i < numCourses; ++i) {
            if (G.dfs(i)) {
                return false;
            }
        }
        return true;
    }

    static class Graph {
        private int V;
        List<List<Integer>> adj;
        int[] colors;

        public Graph(int v) {
            this.V = v;
            this.adj = new ArrayList<>(v);
            for (int i = 0; i < v; ++i) {
                adj.add(new ArrayList<>());
            }
            this.colors = new int[v];
        }

        public void addEdge(int u, int v) {
            adj.get(u).add(v);
        }

        public boolean dfs(int u) {
            colors[u] = 1;
            for (int v : adj.get(u)) {
                if (colors[v] == 1) {
                    return true;
                }
                if (colors[v] == 0 && dfs(v)) {
                    return true;
                }
            }
            colors[u] = 2;
            return false;
        }
    }
}
