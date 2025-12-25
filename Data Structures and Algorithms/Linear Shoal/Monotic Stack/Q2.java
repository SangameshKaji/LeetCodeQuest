//
import java.util.*;
class Q2 {
    public int evalRPN(String[] t) {
        Stack<Integer> s = new Stack<>();
        for (String t1 : t) {
            if (!t1.equals("+") && !t1.equals("-") && !t1.equals("*") && !t1.equals("/")) {
                s.push(Integer.valueOf(t1));
            } else {
                int a = s.pop();
                int b = s.pop();
                int c = 0;
                switch (t1) {
                    case "+" -> c = b + a;
                    case "-" -> c = b - a;
                    case "*" -> c = b * a;
                    case "/" -> c = b / a;
                }
                s.push(c);
            }
        }
        return s.pop();
    }
}