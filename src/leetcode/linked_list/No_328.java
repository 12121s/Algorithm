package leetcode.linked_list;

public class No_328 {
    public static void main(String[] args) {
        System.out.println(oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
        System.out.println(oddEvenList(new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(7)))))))));
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode currentOddNode = new ListNode(head.val);
        ListNode currentEvenNode = new ListNode();

        ListNode oddNode = currentOddNode;
        ListNode evenNode = currentEvenNode;

        ListNode tempOddNode = currentOddNode;
        ListNode tempEvenNode = currentEvenNode;

        head = head.next;

        int i = 0;
        while (head != null) {
            if (i % 2 == 0) {
                currentEvenNode = new ListNode(head.val);
                tempEvenNode.next = currentEvenNode;
                tempEvenNode = tempEvenNode.next;
            } else {
                currentOddNode = new ListNode(head.val);
                tempOddNode.next = currentOddNode;
                tempOddNode = tempOddNode.next;
            }
            head = head.next;
            i++;
            if (head == null) {
                tempOddNode.next = evenNode.next;
            }
        }

        head = oddNode;

        return head;
    }

}
