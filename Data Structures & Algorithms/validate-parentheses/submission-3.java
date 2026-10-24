class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '}'){
                if(stack.isEmpty() || stack.poll() != '{'){
                    return false;
                }
            }
            else if(c == ']'){
                if(stack.isEmpty() || stack.poll() != '['){
                    return false;
                }
            }
            else if(c == ')'){
                if(stack.isEmpty() || stack.poll() != '('){
                    return false;
                }
            }
            else{
                stack.push(c);
                }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
