public class Realis<T> implements Iterator {
    private int index;
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public T next() {
        return array[index++];
    }

    @Override
    public boolean hasNext() {
        return index < array.length;

    }

}
