package leetcode.linked_list;

public class No_234 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2))));
        System.out.println(isPalindrome(new ListNode(1)));
        System.out.println(isPalindrome(new ListNode(1, new ListNode(0, new ListNode(1)))));
        System.out.println(isPalindrome(new ListNode(0, new ListNode(1, new ListNode(1)))));
        System.out.println(isPalindrome(new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(1))))));
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(1)))))));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode endToMiddle = reverseList(middleNode(head));

        while (head != null && endToMiddle != null) {
            if (head.val != endToMiddle.val)
                return false;
            head = head.next;
            endToMiddle = endToMiddle.next;
        }
        return true;
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 갯수가 홀수인 경우
        if (fast != null) slow = slow.next;

        return slow;
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
