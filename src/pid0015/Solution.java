package pid0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> r = new ArrayList<List<Integer>>();
        int x, y;

        int length = nums.length;

        if (length >= 3) {
            for (int i = 0; i < length; i++) {

                if (nums[i] > 0)
                    break;

                if (i > 0 && nums[i] == nums[i - 1])
                    continue;

                x = i + 1;
                y = length - 1;

                while (x < y) {
                    int sum = nums[i] + nums[x] + nums[y];
                    if (sum == 0) {
                        r.add(Arrays.asList(nums[i],nums[x],nums[y]));
                        while (x<y && nums[x] == nums[x+1]) {
                            x++;
                        }
                        while (x<y && nums[y] == nums[y-1]) {
                            y--;
                        }
                        x++;
                        y--;
                    } else if (sum < 0){
                        x++;
                    } else if (sum > 0) {
                        y--;
                    }
                }

            }
        }

        return r;
    }
    

}