package org.game.service;

public interface Stack<T> {
    int size();
    boolean isEmpty();
    void push(T val);
    T top();
    T pop();
}
