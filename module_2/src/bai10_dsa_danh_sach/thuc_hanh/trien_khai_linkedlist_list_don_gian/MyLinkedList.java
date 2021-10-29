package bai10_dsa_danh_sach.thuc_hanh.trien_khai_linkedlist_list_don_gian;

public class MyLinkedList {
    // phần từ đầu tiên
    private Node head;
    // số lượng node
    private int numNodes;
    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    private class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node after;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        after = temp.next;
        temp.next = new Node(data);
        temp.next.next = after;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }


}
