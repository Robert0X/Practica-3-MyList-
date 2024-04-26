public class MyLinkedList implements MyList {
    private Node head;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(String s) {
        if (head == null) {
            head = new Node(s, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(s, null);
        }
        size++;
        return true;
    }

    @Override
    public String get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        Node current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public boolean contains(String s) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(s)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean remove(int i) {
        if (i < 0 || i >= size) {
            return false;
        }
        if (i == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int j = 0; j < i - 1; j++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
        return true;
    }

    @Override
    public boolean remove(String s) {
        if (head == null) {
            return false;
        }
        if (head.value.equals(s)) {
            head = head.next;
            size--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value.equals(s)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int index(String s) {
        Node current = head;
        for (int i = 0; current != null; i++) {
            if (current.value.equals(s)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    private static class Node {
        private String value;
        private Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}