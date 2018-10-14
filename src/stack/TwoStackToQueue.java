package stack;

import java.util.Stack;

/**
 * created by dailf on 2018/9/23
 *
 * @author dailf
 */
public class TwoStackToQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
            stack1.push(node);

    }
public Integer pop() throws Exception {
    if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
    if (stack2.isEmpty()) {
        throw new Exception("队列为空，不能删除");
    }
    return stack2.pop();

}
}
