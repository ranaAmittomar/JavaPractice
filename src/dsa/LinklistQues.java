package dsa;


class Node {
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}


class LinklistQues {

    Node head;

    public LinklistQues() {
        head = null;
    }

    public void insertData(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void displayLL() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinklistQues ll = new LinklistQues();
        ll.insertData(10);
        ll.insertData(20);
        ll.insertData(120);
        ll.insertData(102);
        ll.displayLL();
    }

}