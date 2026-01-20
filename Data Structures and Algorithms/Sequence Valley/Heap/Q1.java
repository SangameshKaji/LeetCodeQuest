//Q1. Last Stone Weight
import java.util.*;
class Q1 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int s : stones) {
            maxHeap.add(s);
        }

        while (maxHeap.size() > 1) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if (y != x) {
                maxHeap.add(y - x);
            }
        }

        Integer last = maxHeap.poll();
        return last == null ? 0 : last;
    }
}