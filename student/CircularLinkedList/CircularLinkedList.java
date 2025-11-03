package CircularLinkedList;

public class CircularLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public int at(int index) {
        if (index < 0 || head == null) return -1;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = next(current);
        }
        return current.value;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = next(current);
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (head == null || index < 0) return;

        if (index == 0) {
            if (size == 1) {
                head = null;
            } else {
                Node tail = head;
                while (tail.next != head) {
                    tail = next(tail);
                }
                head = head.next;
                tail.next = head;
            }
            size--;
            return;
        }

        Node prev = head;
        Node curr = head;
        for (int i = 0; i < index; i++) {
            prev = curr;
            curr = next(curr);
        }

        prev.next = curr.next;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    private Node next(Node node) {
        System.out.print("Go to next node\n");
        return node.next;
    }
}