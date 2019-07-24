package pid0002;

import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        
        int ten = 0;
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        while (temp1 != null || temp2 != null) {
            int d1 = temp1 != null ? temp1.val : 0;
            int d2 = temp2 != null ? temp2.val : 0;
            
            int sum = d1 + d2 + ten;
            
            ten = sum > 9 ? 1 : 0;

            tempList.add(sum % 10);
            
            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }
 
        if (ten == 1) {
            tempList.add(ten);
        }
        Collections.reverse(tempList);

        ListNode rNode = null;
        for (Integer integer : tempList) {
            ListNode tempNode = new ListNode(integer);
            tempNode.next = rNode;
            rNode = tempNode;
        }
        return rNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}