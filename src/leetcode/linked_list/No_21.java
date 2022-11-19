package leetcode.linked_list;

public class No_21 {
    public static void main(String[] args) {
        No_21 q = new No_21();
        System.out.println(
                q.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(3))),
                new ListNode(1, new ListNode(3, new ListNode(4)))));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;

        if(list2 == null)
            return list1;

        ListNode mergeListDummyHead = new ListNode();
        ListNode mergeNode = mergeListDummyHead;

        while(list1 != null && list2 != null) {

            if(list1.val < list2.val) {
                mergeNode.next = list1;
                list1 = list1.next;
            }else {
                mergeNode.next = list2;
                list2 = list2.next;
            }

            mergeNode = mergeNode.next;
        }

        mergeNode.next = list1 == null ? list2 : list1;

        return mergeListDummyHead.next;
    }

}
