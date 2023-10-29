package algorithmBased;

class ListNode {
    int data;
    ListNode next;

    private ListNode(int val) {
        this.data = val;
        this.next = null;
    }
}

public class TwoPointer {

    ListNode head;

    public static boolean hasCycle(ListNode head) { // cycle in link list.
        if (head == null) {
            System.out.println("null");
        }
        ListNode starListNode, eListNode;
        starListNode = eListNode = head;
        while (eListNode != null && eListNode.next != null) {
            eListNode = eListNode.next.next;
            starListNode = starListNode.next;
            if (starListNode == eListNode) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
