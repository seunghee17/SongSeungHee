import java.io.*;
import java.util.*;
import java.math.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int time = 0;
        for(int i = 0; i<truck_weights.length; i++) {
            int truck = truck_weights[i];
            while(true) {
                if(queue.isEmpty()) {
                    queue.offer(truck);
                    sum += truck;
                    time++;
                    break;
                }
                else if(queue.size() == bridge_length) {
                        sum -= queue.poll();
                    } 
                else {
                     if(sum+truck > weight) {
                        queue.offer(0);
                        time++;
                    } else {
                         queue.offer(truck);
                         sum += truck;
                         time++;
                         break;
                     }
                }
            }
        }
        return time + bridge_length;
    }
}