import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {}

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add (int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else {
            if (size == elements.length) {
                ensureCapacity(size + 1);
            }
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            size++;
            elements[index] = element;
        }
    }

    public E remove (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[index] = null;
            size--;
            return (E) elements[index];
        }
    }

    public int size() {
        size = elements.length;
        return size;
    }

    public E clone() {
        Object[] newElements = Arrays.copyOf(elements, size);
        return (E) newElements;
    }

    public boolean contains (E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf (E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        } else {
            return (E) elements[i];
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
