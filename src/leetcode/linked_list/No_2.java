package leetcode.linked_list;

public class No_2 {
    public static void main(String[] args) {
        No_2 q = new No_2();
        System.out.println(q.addTwoNumbers(
                        new ListNode(9, new ListNode(2, new ListNode(3))),
                        new ListNode(1, new ListNode(3, new ListNode(4)))).toString());
        System.out.println(q.addTwoNumbers(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4)))).toString());
        System.out.println(q.addTwoNumbers(
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))).toString());
    }

    /**
     * Runtime: 4 ms, faster than 52.32% of Java online submissions for Add Two Numbers.
     * Memory Usage: 47.7 MB, less than 60.35% of Java online submissions for Add Two Numbers.
     * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode addNum = head;

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 == null) l1 =  new ListNode(0);
            if (l2 == null) l2 =  new ListNode(0);
            addNum.next = new ListNode ((l1.val + l2.val + carry) % 10);
            carry = (l1.val + l2.val + carry) / 10;
            l1 = l1.next;
            l2 = l2.next;
            addNum = addNum.next;
        }
        head = head.next;

        return head;
    }
}
