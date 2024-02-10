package org.example;

public class ArrayList implements List301 {
    int size = 10;
    int indexLast = 0;
    Integer[] array = new Integer[size];

    @Override
    public void add(Integer e) throws EmptyElementException {
        if (e == null) throw new EmptyElementException();
        if(indexLast == size){
            Integer[] src = array.clone();
            array = new Integer[size * 2];
            System.arraycopy(src, 0, array, 0, size);
            size *= 2;
        }
        array[indexLast] = e;
        indexLast++;
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException{
        if (index >= size) throw new IndexOutOfBoundsException();
        return array[index];
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= size) throw new IndexOutOfBoundsException();
        System.arraycopy(array, index + 1, array, index, indexLast - index);
        indexLast --;
        array[indexLast] = null;
    }

    @Override
    public Integer pop(){
        indexLast --;
        Integer x = array[indexLast];
        array[indexLast] = null;
        return x;
    }

    @Override
    public int size(){
        return indexLast;
    }
}