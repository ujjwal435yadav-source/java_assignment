class Q75 {
    static class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // linking
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        // forward traversal
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // move to last
        temp = third;

        // backward traversal
        System.out.print("\nBackward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}