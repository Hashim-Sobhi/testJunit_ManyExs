package iti.jets;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyStack {
    private List<Integer> stack;

    public MyStack(){
        stack = new ArrayList<>();
    }
    public void push(int i) {
        stack.add(i);
    }

    public int getSize() {
        return stack.size();
    }

    public int getPeek() {
        if(stack.isEmpty())
            throw new IllegalStateException("stack is empty");
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public List<Integer> getCurrentStack() {
        return new ArrayList<>(stack);
    }

    public int pop() {
        if(stack.isEmpty())
            throw new IllegalStateException("stack is empty");
        int itemToRemove = getPeek();
        stack.remove(getSize()-1);
        return itemToRemove;
    }
}
