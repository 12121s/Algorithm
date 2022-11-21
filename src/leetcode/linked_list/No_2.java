package leetcode.linked_list;

public class No_2 {
    public static void main(String[] args) {
        No_2 q = new No_2();
        System.out.println(
                q.addTwoNumbers(
                        new ListNode(9, new ListNode(2, new ListNode(3))),
                        new ListNode(1, new ListNode(3, new ListNode(4)))).toString());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode addNum = head;

        for (int i = 1; l1 != null && l2 != null; i++) {
            addNum.next = new ListNode ((int) ((l1.val + l2.val + carry) % Math.pow(10, i)));
            carry = (int) ((l1.val + l2.val + carry) / Math.pow(10, i));
            l1 = l1.next;
            l2 = l2.next;
            addNum = addNum.next;
        }

        return head;
    }
}
