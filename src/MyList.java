import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }


    public MyList(int capacity) {
        this.size = capacity;
    }

    public void add(int index, E element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index not valid.");
        } else {
            ensureCapacity(size());
            elements[index] = element;
        }
    }

    public E remove(int index) {
        Object removeValue = null;
        if (index<0 || index>elements.length){
            throw new IndexOutOfBoundsException("Index not found");
        }else {
            for (int i=0;i<elements.length;i++){
                if (index ==i){
                    removeValue = elements[i];
                    elements[i]= null;
                }
            }
        }
        return (E) removeValue;
    }

    public int size() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null)
                size++;
        }
        return size;
    }

    public MyList<E> clone() {
        MyList<E> list = new MyList<>();
        for (int i = 0; i < elements.length; i++) {
            list.add((E)elements[i]);
        }
        return list;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                index = i;
            } else {
                System.out.println("element not found in list.");
            }
        }
        return index;
    }

    public boolean add(E e) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                elements[i] = e;
                break;
            } else {
                ensureCapacity(size());
                add(e);
            }
        }
        return true;

    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        E e = null;
        for (int j = 0; j < elements.length; j++) {
            if (elements[i] != null) {
                e = (E) elements[i];
            } else {
                e = null;
            }
        }
        return e;
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                elements[i] = null;
            }
        }
    }
}
