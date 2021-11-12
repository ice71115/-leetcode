class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int num1,num2;
        for(String token:tokens){
            if(token.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else
            if(token.equals("-")){
                num2=stack.pop();
                num1=stack.pop();
                stack.push(num1-num2);
            }else
            if(token.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else
            if(token.equals("/")){
                num2=stack.pop();
                num1=stack.pop();
                stack.push(num1/num2);
            }else
                stack.push(Integer.parseInt(token));
            
        }
        return stack.pop();
    }
}