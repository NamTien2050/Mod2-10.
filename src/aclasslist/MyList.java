package aclasslist;

import java.util.Arrays;

// Tạo lớp với các thuộc tính như mô tả
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //  Cài đặt phương thức levelCapa()
    private void levelCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Cài đặt phương thức add()
    public void add(E e) {
        if (size == elements.length) {
            levelCapa();
        }
        elements[size++] = e;
    }
// Cài đặt phương thức get()
    public E get(int i){
        if(i>= size || i<0){
            throw new IndexOutOfBoundsException("Index: "+i+", Size: "+i);
        }
        return (E) elements[i];
    }
}
