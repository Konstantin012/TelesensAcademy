package com.academy.lesson09.Generic;

import java.util.Arrays;

public class GenArray <T> {

    T[] array;

    public GenArray(T[] array)
    {
        this.array = array;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index>array.length) throw new IndexOutOfBoundsException();
        else return array[index];
    }

    public void set(int index, T element)throws IndexOutOfBoundsException {
        if (index>array.length) throw new IndexOutOfBoundsException();
        else array[index] = element;
    }

    public GenArray sorting(){
        Arrays.sort(array);
        return this;
    }

    @Override
    public String toString() {
        return "GenArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenArray<?> genArray = (GenArray<?>) o;
        return Arrays.equals(array, genArray.array);
    }


}
