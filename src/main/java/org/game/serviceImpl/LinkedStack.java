package org.game.serviceImpl;

import org.game.service.Stack;

import java.util.LinkedList;

public class LinkedStack<T> implements Stack<T> {
    LinkedList<T> list = new LinkedList<>();
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T val) {
        list.addFirst(val);
    }

    @Override
    public T top() {
        return list.getFirst();
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }
}
