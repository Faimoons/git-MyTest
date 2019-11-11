public class Realis2<T> implements Iterator {
    private int index;
    private T[][] array;
    private int index2 = 0;

    public void setArray(T[][] array) {
        this.array = array;
    }

    @Override
    public T next() {
        if (index2 >= array[index].length) {
            index2 = 0;
                while (index2 >= array[index + 1].length) {
                    index++;
            }
            return array[++index][index2++];
        } else return array[index][index2++];
    }


    @Override
    public boolean hasNext() {
        if (index < array.length) {
            if (index2 >= array[index].length) {
                if (index + 1 < array.length) {
                    return true;
                } else return false;
            } else {
                return true;
            }
        } else return false;
    }

}

