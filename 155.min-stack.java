import java.util.ArrayList;

/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
class MinStack {
    ArrayList<Integer> st;
    ArrayList<Integer> min;
    int size;

    /** initialize your data structure here. */
    public MinStack() {
        this.st = new ArrayList<>();
        this.min = new ArrayList<>();
        this.size = 0;

    }

    public void push(int x) {
        this.st.add(x);
        if (this.size == 0)
            this.min.add(x);
        else {

            if (x <= this.min.get(size - 1)) {
                this.min.add(x);
            } else {
                this.min.add(this.min.get(size - 1));
            }
        }
        this.size++;

    }

    public void pop() {
        if (this.st.size() != 0) {
            this.st.remove(size - 1);
            this.min.remove(size - 1);
            this.size--;
        }
        // what about top
    }

    public int top() {
        if (size > 0) {
            return this.st.get(size - 1);
        }
        return 0;
    }

    public int getMin() {
        return this.min.get(size - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */
// @lc code=end
