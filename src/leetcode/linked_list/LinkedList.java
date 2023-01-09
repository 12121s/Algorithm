package leetcode.linked_list;

class LinkedList {
    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    ListNode add(ListNode nodeToAdd, int position) {
        if (head == null) {
            head = nodeToAdd;
        } else {
            ListNode node = head;
            for (int i = 0; i < position - 1; i++) {
                node = node.next;
            }
            nodeToAdd.next = node.next;
            node.next = nodeToAdd;
        }

        return head;
    }

    public ListNode remove(int positionToRemove) {
        if (head == null) {
            return head;
        }
        if (positionToRemove == 0) {
            head = head.next;
            return head;
        }

        ListNode node = head;
        for (int i = 0; i < positionToRemove - 1; i++) {
            if (node == null) {
                return head;
            }
            node = node.next;
        }
        node.next = node.next.next;

        return head;
    }

    boolean contains(ListNode nodeToCheck) {
        ListNode node = head;
        while (node != null) {
            if (node.val == nodeToCheck.val) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

}
