package pid0015;

import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int numbers[] = { -1, 0, 1, 2, -1, -4 };
        long begin = (new Date()).getTime();
        List<List<Integer>> list = solution.threeSum(numbers);
        long end = (new Date()).getTime();
        System.out.println("耗时：" + (end - begin) + "ms");
        for (List<Integer> listItem : list) {
            System.out.println("[" + listItem.get(0) + "," + listItem.get(1) + "," + listItem.get(2) + "]");
        }

    }
}
