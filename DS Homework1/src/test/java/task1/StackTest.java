package task1;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StackTest {
    private Stack<Integer> s;

    @Test
    @Order(1)
    void testEmptySize() {
        s = new Stack<>();
        assertEquals(0, s.size());
    }

    @Test
    @Order(2)
    void testisEmptyNoElements() {
        s = new Stack<>();
        assertTrue(s.isEmpty());
    }

    @Test
    @Order(3)
    void testPush() {
        s = new Stack<>();
        s.push(5);
        s.push(2);
        s.push(6);
        assertEquals(3, s.size());
        assertFalse(s.isEmpty());
    }

    @Test
    @Order(4)
    void testPop() {
        s = new Stack<>();
        s.push(5);
        s.push(2);
        s.push(6);
        assertEquals(6, s.pop());
        assertEquals(2, s.pop());
        assertEquals(5, s.pop());
        assertEquals(0, s.size());
        assertTrue(s.isEmpty());
    }

    @Test
    @Order(5)
    void testPushAndPopCombo() {
        s = new Stack<>();
        s.push(5);
        s.push(2);
        s.pop();
        s.push(6);
        s.push(7);
        s.pop();
        s.pop();
        assertEquals(5, s.pop());
        assertEquals(0, s.size());
        assertTrue(s.isEmpty());
    }

    @Test
    @Order(6)
    void testPeek() {
        s = new Stack<>();
        s.push(5);
        s.push(2);
        s.push(6);
        assertEquals(s.peek(), 6);
        assertEquals(3, s.size());
        assertEquals(6, s.pop());
        assertEquals(2, s.size());
        assertFalse(s.isEmpty());
    }
}
