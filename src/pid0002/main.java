package pid0002;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class main {
	public static void main(String[] args) {
	    
		Solution solution=new Solution();
		Integer numbers1[]={2,5,5,3,8};
		Integer numbers2[]={2,1};
		
		List<Integer> list1 = Arrays.asList(numbers1);
		Collections.reverse(list1);
		List<Integer> list2 = Arrays.asList(numbers2);
		Collections.reverse(list2);
		
		
		ListNode l1 = null;
		ListNode l2 = null;
		for (int i : list1) {
            ListNode tempNode = new ListNode(i);
            tempNode.next = l1;
            l1 = tempNode;
        }
		
		for (int i : list2) {
            ListNode tempNode = new ListNode(i);
            tempNode.next = l2;
            l2 = tempNode;
        }
		
		long begin = (new Date()).getTime();
        ListNode list = solution.addTwoNumbers(l1, l2);
        long end = (new Date()).getTime();
        
        System.out.println("耗时：" + (end - begin) + "ms");
        
        ListNode temp = list;
        if (temp == null) {
            System.out.println("返回值为空");
        } else {
            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
                
            } 
        }
	}
}
