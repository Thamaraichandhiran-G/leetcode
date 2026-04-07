class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;

        boolean[] visited = new boolean[n];
        int[] timeVisited = new int[n];

        int time = 1;
        int maxCycle = -1;

        for (int i = 0; i < n; i++) {

            if (visited[i]) continue;

            int curr = i;
            int startTime = time;

            while (curr != -1 && !visited[curr]) {
                visited[curr] = true;
                timeVisited[curr] = time++;

                curr = edges[curr];
            }

            if (curr != -1 && timeVisited[curr] >= startTime) {
                int cycleLength = time - timeVisited[curr];
                maxCycle = Math.max(maxCycle, cycleLength);
            }
        }

        return maxCycle;
    }
}
