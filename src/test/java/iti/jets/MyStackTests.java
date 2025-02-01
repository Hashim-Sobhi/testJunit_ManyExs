package iti.jets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTests {
    private MyStack myStack;
    @BeforeEach
    void setUp(){
        myStack = new MyStack();
    }

    @Test
    void testPushElementToStack(){
        assertTrue(myStack.isEmpty(), "stack is not empty");
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(52);

        assertEquals(5, myStack.getSize());
        assertEquals(52, myStack.getPeek());
        assertFalse(myStack.isEmpty());
        assertEquals(List.of(1,2,3,4,52), myStack.getCurrentStack());
    }

    @Test
    void testpopElementFromStack(){
        var ex = assertThrowsExactly(IllegalStateException.class, ()->myStack.pop());
        assertEquals("stack is empty", ex.getMessage());
        myStack.push(100);
        myStack.push(2);
        myStack.push(50);

        int item1 = myStack.pop();
        assertEquals(50, item1);
        int item2 = myStack.pop();
        assertEquals(2, item2);
        assertFalse(myStack.isEmpty());
        assertEquals(100, myStack.getPeek());
        assertEquals(1, myStack.getSize());

    }

    @Test
    void testPeekElementFromStack(){
        var ex = assertThrowsExactly(IllegalStateException.class, ()->myStack.getPeek());
        assertEquals("stack is empty", ex.getMessage());
        myStack.push(100);
        myStack.push(2);
        myStack.push(1);
        myStack.push(5);
        assertEquals(5, myStack.getPeek());
        myStack.pop();
        assertEquals(1, myStack.getPeek());
        myStack.pop();
        assertEquals(2, myStack.getPeek());
    }
}
