import java.util.ArrayList;

public class MyArrayList<E> implements MyList<E> {
    private ArrayList<E> elements;
    private int size;

    public MyArrayList() {
        elements = new ArrayList<>();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E element) {
        elements.add(element);
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return elements.get(index);
    }

    @Override
    public boolean contains(E element) {
        return elements.contains(element);
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        E element = elements.get(index);
        elements.remove(index);
        size--;
        return true;
    }

    @Override
    public boolean remove(E element) {
        int index = elements.indexOf(element);
        if (index == -1) {
            return false;
        }
        elements.remove(index);
        size--;
        return true;
    }

    @Override
    public int indexOf(E element) {
        return elements.indexOf(element);
    }
}