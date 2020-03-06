package com.task6.collection.collection;
import java.util.Arrays;

public class CustomList<C> {

    private int size=0;
    private static final int DEF_CAPACITY=10;
    private Object elements[];
 
    public CustomList() {
        elements=new Object[DEF_CAPACITY];
    }
 
    public void add(C c) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++]=c;
    }
     
    @SuppressWarnings("unchecked")
    public C fetch(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
        }
        return (C) elements[i];
    }
     
    @SuppressWarnings("unchecked")
    public C remove(int i) {
        if (i>=size || i<0) {
            throw new IndexOutOfBoundsException("Index: " +i+", Size "+i);
        }
        Object ele=elements[i];
        int num_of_Elt=elements.length-(i+1) ;
        System.arraycopy(elements, i+1, elements, i, num_of_Elt) ;
        size--;
        return (C) ele;
    }
     
    public int getSize() {
        return size;
    }
     
    @Override
    public String toString() 
    {
         StringBuilder s=new StringBuilder();
         s.append('[');
         for(int i=0;i<size;i++) {
             s.append(elements[i].toString());
             if(i<size-1){
                 s.append(",");
             }
         }
         s.append(']');
         return s.toString();
    }
     
    private void ensureCapacity() {
        int newSize=elements.length*2;
        elements=Arrays.copyOf(elements,newSize);
    }
}