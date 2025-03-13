public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node{
        Node next;
        Object data;

        public Node (Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {}

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void add (int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        if (head == null || index == 0) { // Nếu danh sách rỗng hoặc thêm vào vị trí đầu tiên
            addFirst(element);
            return;
        }
        Node temp = head;
        Node holder;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node temp = head;
        Object removedData;

        if (index == 0) {
            removedData = head.data;
            head = head.next;
        } else {
            Node prev = null;
            for (int i = 0; i < index; i++) {
                prev = temp;
                temp = temp.next;
            }
            removedData = temp.data;
            prev.next = temp.next;
        }
        numNodes--;
        return (E) removedData;
    }

    public boolean remove(Object e) {
        Node temp = head;
        Object removedData;
        if (temp.data.equals(e)) {
            removedData = head.data;
            head = head.next;
            numNodes--;
            return true;
        }
        for (int i = 0; i < numNodes; i++) {
            Node prev = temp;
            temp = temp.next;
            if (temp.data.equals(e)) {
                prev.next = temp.next;
                numNodes--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public E clone() {
        MyLinkedList<E> clonedList = new MyLinkedList<E>();
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp != null) {
            clonedList.addLast((E)temp.data);
            temp = temp.next;
        }
        return (E) clonedList;
    }

    public boolean contains(E e) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data.equals(e)) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public boolean addBool (E e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        numNodes += minCapacity;
    }

    public E get(int i) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (index == i) {
                return (E) temp.data;
            }
            i++;
            temp = temp.next;
        }
        return null;
    }

    public E getFirst() {
        Node temp = head;
        return (E) temp.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear () {
        head = null;
        numNodes = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
