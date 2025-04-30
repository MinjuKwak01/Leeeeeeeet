import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stk.pop();
            } else if (operations[i].equals("D")) {
                int num = 2 * stk.peek();
                stk.push(num);
            } else if (operations[i].equals("+")) {
                int first = stk.pop();
                int second = stk.pop();
                stk.push(second);
                stk.push(first);
                stk.push(first + second);

            } else {
                stk.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        while (!stk.isEmpty()) {
            sum += stk.pop();
        }

        return sum;

    }
}