class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            char now = s.charAt(i);
            if(now == '{' || now == '[' || now == '(') {
                stack.add(now);
            } else if(!stack.isEmpty()) {
                char top = stack.peek();
                if(top == '{' && now == '}') {
                    stack.pop();
                } else if(top == '[' && now == ']') {
                    stack.pop();
                } else if(top == '(' && now == ')') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        
        if(stack.isEmpty()) return true;
        return false;
    }
}