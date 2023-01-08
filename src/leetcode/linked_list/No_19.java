package leetcode.linked_list;

public class No_19 {
    public static void main(String[] args) {
        System.out.println(removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));
        System.out.println(removeNthFromEnd(new ListNode(1), 1));
        System.out.println(removeNthFromEnd(new ListNode(1, new ListNode(2)), 1));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode reverseNode = reverseList(head);

        return reverseList(remove(reverseNode, n - 1));
    }

    public static ListNode remove(ListNode head, int pos) {
        if (head == null) {
            return null;
        }
        if (pos == 0) {
            head = head.next;
            return head;
        }

        ListNode node = head;
        for (int i = 0; i < pos - 1; i++) {
            if (node == null) {
                return head;
            }
            node = node.next;
        }
        node.next = node.next.next;

        return head;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode tempNode = new ListNode();
        ListNode prevNode = null;

        while(head != null) {
            tempNode = head;
            head = head.next;
            tempNode.next = prevNode;
            prevNode = tempNode;
        }

        return tempNode;
    }
}
