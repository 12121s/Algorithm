package leetcode.linked_list;

public class No_206 {
    public static void main(String[] args) {
        No_206 q = new No_206();
        System.out.println(q.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))).toString());
        System.out.println(q.reverseList(null).toString());
    }

    /*
    * untime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    * Memory Usage: 42.4 MB, less than 79.41% of Java online submissions for Reverse Linked List.
    * */
    public ListNode reverseList(ListNode head) {
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
