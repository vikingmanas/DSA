class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String c : tokens) {
            switch (c) {
                case "+": {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a + b);
                    break;
                }
                case "-": {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b- a);
                    break;
                }
                case "*": {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a * b);
                    break;
                }
                case "/": {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b / a);
                    break;
                }
                default: {
                    st.push(Integer.parseInt(c));
                }
            }

        }
        return st.peek();
    }
}
