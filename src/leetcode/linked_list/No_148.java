package leetcode.linked_list;

public class No_148 {
    public static void main(String[] args) {
        System.out.println(sortList(new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))))));
        System.out.println(sortList(new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))))));
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        // step 2. sort each half
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return mergeNode(left, right);
    }

    public static ListNode mergeNode(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        // ListNode head = l1.val > l2.val? l2: l1;
        ListNode head;
        if(l1.val > l2.val){
            head = l2;
            l2 = l2.next;
        }else{
            head = l1;
            l1 = l1.next;
        }

        ListNode cur = head;

        while(l1!=null && l2!= null){
            if(l1.val > l2.val){
                cur.next = l2;
                l2 = l2.next;
            }else{
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }

        // deal with the rest nodes
        if(l1 != null) cur.next = l1;
        if(l2 != null) cur.next = l2;

        return head;
    }
}
