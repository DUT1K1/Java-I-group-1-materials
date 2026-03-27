import java.util.NoSuchElementException;

public class IntLinkedList {
    private static final class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // წვდომა (Access)
    public int get(int index) {
        checkElementIndex(index);
        return nodeAt(index).value;
    }

    public int set(int index, int value) {
        checkElementIndex(index);
        Node node = nodeAt(index);
        int oldValue = node.value;
        node.value = value;
        return oldValue;
    }

    public int getFirst() {
        ensureNonEmpty();
        return head.value;
    }

    public int getLast() {
        ensureNonEmpty();
        return tail.value;
    }


    // დამატება (Add)
    public void add(int value) {
        addLast(value);
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (isEmpty()) {
            tail = newNode;
        }

        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void add(int index, int value) {
        checkPositionIndex(index);

        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }

        Node previous = nodeAt(index - 1);
        Node newNode = new Node(value);
        newNode.next = previous.next;
        previous.next = newNode;

        size++;
    }


    // ამოღება (Remove)
    public int removeFirst() {
        ensureNonEmpty();
        int value = head.value;
        head = head.next;
        size--;

        if (isEmpty()) {
            tail = null;
        }

        return value;
    }

    public int removeLast() {
        ensureNonEmpty();

        if (size == 1) {
            int value = head.value;
            head = null;
            tail = null;
            size = 0;
            return value;
        }

        int value = tail.value;
        Node newTail = nodeAt(size - 2);
        newTail.next = null;
        tail = newTail;
        size--;

        return value;
    }

    public int remove(int index) {
        checkElementIndex(index);

        if (index == 0) {
            return removeFirst();
        }

        if (index == size - 1) {
            return removeLast();
        }

        Node previous = nodeAt(index - 1);
        Node removedNode = previous.next;
        previous.next = removedNode.next;
        size--;
        return removedNode.value;
    }

    public boolean removeValue(int value) {
        if (isEmpty()) {
            return false;
        }

        if (head.value == value) {
            removeFirst();
            return true;
        }

        Node red = head;
        Node green = head.next;

        while (green != null) {
            if (green.value == value) {
                red.next = green.next;
                if (green == tail) {
                    tail = red;
                }
                size--;
                return true;
            }
            red = green;
            green = green.next;
        }

        return false;
    }


    // ძებნა/შემოწმება
    public int indexOf(int value) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.value == value) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }


    // რეპრეზენტაცია
    public int[] toArray() {
        int[] array = new int[size];
        Node current = head;
        int index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }


    // ბონუს ამოცანები
    public void reverse() {
        if (size <= 1) {
            return;
        }

        Node previous = null;
        Node current = head;
        tail = head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    public int count(int value) {
        int count = 0;
        Node current = head;

        while (current != null) {
            if (current.value == value) {
                count++;
            }
            current = current.next;
        }

        return count;
    }

    public boolean equals(IntLinkedList other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (size != other.size) {
            return false;
        }

        Node current = head;
        Node otherCurrent = other.head;

        while (current != null) {
            if (current.value != otherCurrent.value) {
                return false;
            }
            current = current.next;
            otherCurrent = otherCurrent.next;
        }

        return true;
    }

    // private helpers
    private Node nodeAt(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + size
            );
        }
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + size
            );
        }
    }

    private void ensureNonEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
    }
}
