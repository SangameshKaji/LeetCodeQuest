//Q3. Exclusive Time of Functions
import java.util.*;
class Q3{
  public int[] exclusiveTime(int n, List<String> logs) {
    int[] ans = new int[n];
    Deque<Integer> stack = new ArrayDeque<>();
    int prevTime = -1;

    for (final String log : logs) {
      final String[] splits = log.split(":");
      final int id = Integer.parseInt(splits[0]);        
      final char label = splits[1].charAt(0);            
      final int timestamp = Integer.parseInt(splits[2]); 
      if (label == 's') {
        if (!stack.isEmpty())
          ans[stack.peek()] += timestamp - prevTime;
        stack.push(id);
        prevTime = timestamp;
      } else {
        ans[stack.pop()] += timestamp - prevTime + 1;
        prevTime = timestamp + 1;
      }
    }

    return ans;
  }
}