public interface MyList<E> {
    int size();

    boolean add(E element);

    E get(int index);

    boolean contains(E element);

    boolean remove(int index);

    boolean remove(E element);

    int indexOf(E element);
}