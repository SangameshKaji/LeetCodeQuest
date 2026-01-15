//Q2. Time Needed to Buy Tickets
import java.util.*;
class Q2 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.offer(new int[]{i, tickets[i]});
        }

        int time = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            cur[1]--;
            time++;

            if (cur[1] == 0) {
                if (cur[0] == k) {
                    return time;
                }
            } else {
                q.offer(cur);
            }
        }
        return time;
    }
}