package uk.ac.tees.linkedlistica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A suite of unit tests for the {@link DoublyLinkedList} class.
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 * @since 23/01/2020
 */
public class DoublyLinkedListTest {
    
    public DoublyLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
        
    /**
     * Converts a doubly linked list to an array.
     * 
     * @param list  the list to convert
     * @return      the converted list
     */
    private static int[] doublyLinkedListToArray(DoublyLinkedList list) {
        // Gauge size.
        int n = 0;
        DoublyLinkedListNode c = list.head;
        while (c != null) {
            n++;
            c = c.next;
        }
        // Copy to int array.
        int[] arr = new int[n];
        c = list.head;
        int i = 0;
        while (c != null) {
            arr[i++] = c.data;
            c = c.next;
        }
        return arr; // Return result.
    }

    
//    /**
//     * Test of isEmpty method
//     */
    @Test
    public void testIsEmpty() {
        // Create instance.
        DoublyLinkedList instance = new DoublyLinkedList(
                new int[] {2, 4, 6, 7, 8});
        boolean empty = new DoublyLinkedList(new int[] {}).isEmpty();
        assertTrue("True should return for empty lists.", empty);
        boolean notEmpty = instance.isEmpty();
        assertFalse("False should return for non-empty lists.", notEmpty);
    }
//    
//     /**
//     * Test of toString method
//     */
    @Test
    public void testToString() {
        // Create instance.
        DoublyLinkedList instance = new DoublyLinkedList(
                new int[] {3, 7, 9, 13, 12});
        assertEquals("List should be correctly turned into a string.", 
                "{3, 7, 9, 13, 12}", instance.toString());
    }
//
//    
//    /**
//     * Test of countNodesWithValue method
//     */
    @Test
    public void testCountNodesWithValue() {
        // Create instance, insert 3 and 6 after first and second index.
        DoublyLinkedList instance = new DoublyLinkedList(
                new int[] {2, 4, 6, 4, 10, 4, 8, 4});
        // Compare to expected.
        assertEquals("Items should be correctly counted.", 
                4, instance.countNodesWithValue(4));
    }
//    
//    
//        /**
//     * Test of countNodesWithValue method
//     */
    @Test
    public void testsearchIndex() {
        // Create instance, insert 3 and 6 after first and second index.
        DoublyLinkedList instance = new DoublyLinkedList(
                new int[] {2, 4, 6, 3, 10});
        // Compare to expected.
        assertEquals("Index should be correctly returned.", 
                1, instance.searchIndex(4));
    }
//    
//    
//    /**
//     * Test of addAfterPos method
//     */
    @Test
    public void testAddAtPos() {
        // Create instance, insert 3 and 6 after first and second index.
        DoublyLinkedList instance = new DoublyLinkedList(
                new int[] {2, 4, 6});
        instance.addAtPos(3, 1);
        instance.addAtPos(6, 2);
        // Compare to expected.
        assertArrayEquals("Items should be correctly added.", 
                new int[] {2, 3, 6, 4, 6}, doublyLinkedListToArray(instance));
    }
    
     @Test
    public void testAddSecondLast() {
        // Create instance, insert 4 and 2 at second last position.
        DoublyLinkedList instance = new DoublyLinkedList(new int[] {8, 8, 0});
        instance.addSecondLast(4);
        instance.addSecondLast(2);
        // Compare to expected.
        assertArrayEquals("Items should be correctly added.", 
                new int[] {8, 8, 4, 2, 0}, doublyLinkedListToArray(instance));
        //8, 8, 0, 4, 2
    }
}
