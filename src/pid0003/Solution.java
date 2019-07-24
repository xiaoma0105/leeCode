package pid0003;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;


class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Queue<Character> queue = new LinkedBlockingQueue<Character>();
        
        int index = 0;
        int maxLen = 0;
        
        while (index < s.length()) {
            char c = s.charAt(index);
            
            if (queue.contains(c)) {
                queue.poll();
                continue;
            } else {
                queue.add(c);
                index++;
            }
            
            //System.out.println("queue.size():" + queue.size());
            if (maxLen < queue.size()) {
                maxLen = queue.size();
            }
        }
        return maxLen;
    }
}