//Q1. Number of Students Unable to Eat Lunch
import java.util.*;

class Q1 {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int[] count = new int[2];

        for (int s : students) {
            q.offer(s);
            count[s]++;
        }

        int i = 0;

        while (!q.isEmpty()) {
            if (count[sandwiches[i]] == 0) {
                break;
            }

            if (q.peek() == sandwiches[i]) {
                count[q.poll()]--;
                i++;
            } else {
                q.offer(q.poll());
            }
        }

        return q.size();
    }
}