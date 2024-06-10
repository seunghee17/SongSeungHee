import java.io.*;
import java.util.*;

class Solution {
    static int result=0;
    public int solution(int N, int number) {
        dfs(0,0,number,N);
        if(result==0) {
            result = -1;
        }
       return result;
    }
    public void dfs(int depth, int sum, int number, int N) {
        if(depth>8) {
           return;
        }
       if(sum == number) {
           if(depth < result || result==0) {
               result = depth;
               return;
           }
       }
        int temp = 0;
        for(int i=1; i<9; i++) {
            temp = temp *10 + N;
            dfs(depth+i, sum + temp, number, N);
            dfs(depth+i, sum - temp, number, N);
            dfs(depth+i, sum / temp, number, N);
            dfs(depth+i, sum * temp, number, N);
        }
        
    }
}