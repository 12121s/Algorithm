package leetcode.linked_list;

public class No_876 {

    public static void main(String[] args) {
        No_876 q = new No_876();
        System.out.println(q.middleNodeLoop(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))).toString());
        System.out.println(q.middleNodeLoop(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))).toString());
        System.out.println(q.middleNodeLoop(new ListNode(1)).toString());
    }

    /**
     * two pointer
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
     * Memory Usage: 40.1 MB, less than 82.09% of Java online submissions for Middle of the Linked List.
     * */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * array
     * 
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
     * Memory Usage: 40.1 MB, less than 82.09% of Java online submissions for Middle of the Linked List.
     * */
    public ListNode middleNodeArray(ListNode head) {
        ListNode[] nodeArr = new ListNode[100];
        int i = 0;
        if (head.next == null)
            nodeArr[i++] = head;

        while (head != null) {
            nodeArr[i++] = head;
            head = head.next;
        }

        return nodeArr[(i / 2)];
    }

    /**
     * loop
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
     * Memory Usage: 41.6 MB, less than 43.39% of Java online submissions for Middle of the Linked List.
     * */
    public ListNode middleNodeLoop(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        for (int i = 0; i < count/2; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
