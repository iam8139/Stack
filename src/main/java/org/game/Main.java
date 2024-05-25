package org.game;

import org.game.service.Stack;
import org.game.serviceImpl.ArrayStack;
import org.game.serviceImpl.LinkedStack;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // ArrayStack Implementation test

        Stack<Integer> stack = new ArrayStack<>();
        System.out.println("Empty Stack: " + stack.isEmpty());
        stack.push(10);
        stack.push(5);
        stack.push(3);
        stack.push(10);
        System.out.println("Stack Size: " + stack.size());
        System.out.printf("Top: %d", stack.top());
        System.out.println();
        System.out.printf("Pop: %d", stack.pop());
        System.out.println();
        System.out.printf("Pop: %d", stack.pop());
        System.out.println();
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Empty Stack: " + stack.isEmpty());

        // LinkedList Implementation Test
        Stack<Integer> stack2 = new LinkedStack<>();
        System.out.println("Empty Stack: " + stack2.isEmpty());
        stack2.push(10);
        stack2.push(5);
        stack2.push(3);
        stack2.push(10);
        System.out.println("Stack Size: " + stack2.size());
        System.out.printf("Top: %d", stack2.top());
        System.out.println();
        System.out.printf("Pop: %d", stack2.pop());
        System.out.println();
        System.out.printf("Pop: %d", stack2.pop());
        System.out.println();
        System.out.println("Stack Size: " + stack2.size());
        System.out.println("Empty Stack: " + stack2.isEmpty());

        // Array reverse Test
        Integer[] arrInt = {1,2,3,4,5};
        String[] arrString = {"MY", "Name", "is", "Kargil"};

        System.out.println("int arr: " + Arrays.toString(arrInt));
        System.out.println("string arr: " + Arrays.toString(arrString));

        reverseArray(arrInt);
        reverseArray(arrString);

        System.out.println("int arr: " + Arrays.toString(arrInt));
        System.out.println("string arr: " + Arrays.toString(arrString));

        // Check if valid expression
        System.out.println("valid expression: " + validExpression("( )(( )){([( )])}"));
        System.out.println("valid expression: " + validExpression("((( )(( )){([( )])}))"));
        System.out.println("valid expression: " + validExpression("({[])}"));
        System.out.println("valid expression: " + validExpression("( "));
    }

    public static <T> void reverseArray(T[] arr) {
        Stack<T> stack = new LinkedStack<>();
        for (T ele : arr) {
            stack.push(ele);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static boolean validExpression(String expression) {
        String opening = "([{";
        String closing = ")]}";
        Stack<Character> stack = new LinkedStack<>();
        for (char temp : expression.toCharArray()) {
            if (opening.indexOf(temp) != -1) {
                stack.push(temp);
            } else if (closing.indexOf(temp) != -1) {
                if (stack.isEmpty()) return false;
                if (closing.indexOf(temp) != opening.indexOf(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }
}