package leetcode.linked_list;

import java.util.HashSet;
import java.util.Set;

public class No_234 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2))));
        System.out.println(isPalindrome(new ListNode(1)));
        System.out.println(isPalindrome(new ListNode(1, new ListNode(0, new ListNode(1)))));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode checkNode = head;
        Set<Integer> checkSet = new HashSet<>();

        while (checkNode != null) {
            if (!checkSet.contains(checkNode.val))
                checkSet.add(checkNode.val);
            else checkSet.remove(checkNode.val);

            checkNode = checkNode.next;
        }

        return checkSet.isEmpty();
    }
}
