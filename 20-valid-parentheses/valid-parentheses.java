class Solution {
    public boolean isValid(String s) {
        // if same number of opeing and closing bracket is there then it must be even
        if (s.length() % 2 != 0)
            return false;
        
        // creating a stack to store parenthesis
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            // checking is the stack is empty and first element is closing parenthesis then it is invalid
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                return false;
            } else {
                // if any closing parentheis comes and last element of stack is their 
                // respective opening parentheis then remove the opeing one from stack otherwise add 
                // the parenthesis
                if(s.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                }
                else if(s.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                }
                else if(s.charAt(i) == ']' && stack.peek() == '['){
                    stack.pop();
                }
                else{
                    stack.add(s.charAt(i));
                }
            }
        }
        // if the stack is empty then all parenthesis were poped, if not empty then some 
        // opeing parentheis doesn't have closing one so return false
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}