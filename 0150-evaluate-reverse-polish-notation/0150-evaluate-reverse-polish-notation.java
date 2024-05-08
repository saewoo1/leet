import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
		for (String token : tokens) {
            if (isOperator(token)){
                if (token.equals("*")) {
                    numbers.push(numbers.pop() * numbers.pop());
                }
                if (token.equals("/")) {
                    int elem1 = numbers.pop();
                    int elem2 = numbers.pop();
                    numbers.push(elem2 / elem1);
                }
                if (token.equals("+")) {
                    numbers.push(numbers.pop() + numbers.pop());
                }
                if (token.equals("-")) {
                    int elem1 = numbers.pop();
                    int elem2 = numbers.pop();
                    numbers.push(elem2 - elem1);
                }
            }
            else
			    numbers.push(Integer.parseInt(token));
		}

		return numbers.pop();
    }

    public boolean isOperator(String s) {
		return s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-");
	}
}