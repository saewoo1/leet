import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        /**
        절대값으로 크기를 따지고, -, +는 방향성
        같은 방향은 마주치지 않고, 충돌 시 큰 값이 살아남는다. 동일할 시 둘 다 파괴된다.
         */
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean isDestroy = false;
            // 충돌이 발생하는동안
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int top = stack.peek();
                if (Math.abs(top) < Math.abs(asteroid)) {
                    stack.pop();
                }
                else if (Math.abs(top) == Math.abs(asteroid)) {
                    stack.pop();
                    isDestroy = true;
                    break;
                }
                else {
                    isDestroy = true;
                    break;
                }
            }
            if (!isDestroy) {
                stack.push(asteroid);
            }
        }
        
        return generateIntArray(stack);
    }

    public int[] generateIntArray(Stack<Integer> stack) {
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}