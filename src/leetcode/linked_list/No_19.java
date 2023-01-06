package leetcode.linked_list;

public class No_19 {
    public static void main(String[] args) {
        System.out.println(removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2).toString());
        System.out.println(removeNthFromEnd(new ListNode(1), 1).toString());
        System.out.println(removeNthFromEnd(new ListNode(1, new ListNode(2)), 1).toString());
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode answer = new ListNode();

        ListNode slow = head;
        ListNode temp = head;
        ListNode fast = head;
        int size = 0;
        int target = 0;
        int i = 0;

        while (temp.next != null) {
            i++;
            slow = slow.next;
            fast = fast.next.next;
            if (fast != null && fast.next != null) {
                size = i;
                target = size - n;
            }

            if (temp.next.data.equals(x)) {
                temp.next = temp.next.next;
                break;
            } else {
                temp = temp.next;
            }
        }

        return answer;
    }
}
