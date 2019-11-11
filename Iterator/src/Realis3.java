public class Realis3<T> implements Conteiner {
    private T[][] array;

//    public Realis3(T[][] array) {
//        this.array = array;
//    }

    public T[][] getArray() {
        return array;
    }

    public void setArray(T[][] array) {
        this.array = array;
    }

    @Override
    public Iterator getIterator() {
        Iterator it = new Iterator() {
            private int index = 0;
            private int index2 = 0;


            private void resetIndex() {
                if (index2 == array[index].length) {
                    index2 = 0;
                    index++;
                }
            }


            @Override
            public boolean hasNext() {
                return index < array.length && index2 < array[index].length;
            }

            @Override
            public T next() {
                if (!hasNext()) return null;
                while (index < array.length) {
                    while (index2 < array[index].length) {
                        if (array[index][index2] != null) {
                            T str = array[index][index2];
                            index2++;
                            resetIndex();
                            return str;
                        } else {
                            index2++;
                            resetIndex();
                        }
                    }
                    index++;
                }
                return null;
            }

        };
        return it;
    }
}