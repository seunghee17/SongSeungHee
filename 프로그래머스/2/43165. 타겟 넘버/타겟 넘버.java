import java.util.*;
class Solution {
    static int count =0;
    public int solution(int[] numbers, int target) {
    
        dfs(numbers, 0, target, 0);
        return count;
    }
    
    static void dfs(int[] numbers, int depth, int target, int result) {
        if(depth == numbers.length) {
            if(result == target) count++;
            return;
        }
        int resulta = result + numbers[depth];
        int resultb = result - numbers[depth];
        dfs(numbers, depth+1, target, resulta);
        dfs(numbers, depth+1, target, resultb);
    }
}