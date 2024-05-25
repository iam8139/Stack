package org.game.serviceImpl;

import org.game.service.Stack;

public class ArrayStack<T> implements Stack<T> {
    private static final int CAPACITY = 1000;
    private T[] arr;
    private int t = -1;
    public ArrayStack() {this(CAPACITY);}
    public ArrayStack(int capacity) {
        arr = (T[]) new Object[capacity];
    }
    @Override
    public int size() {
        return t+1;
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public void push(T val) {
        if (t+1 < CAPACITY) {
            arr[++t] = val;
            System.out.printf("Pushed to the Stack: %d", val);
            System.out.println();
        }
    }

    @Override
    public T top() {
        if (t != -1) {
            return arr[t];
        }
        return null;
    }

    @Override
    public T pop() {
        if (t != -1) {
            return arr[t--];
        }
        return null;
    }
}
