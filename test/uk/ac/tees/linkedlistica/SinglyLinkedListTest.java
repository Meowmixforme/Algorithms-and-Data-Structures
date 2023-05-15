package uk.ac.tees.linkedlistica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A suite of unit tests for the {@link SinglyLinkedList} class.
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 * @since 23/01/2020
 */
public class SinglyLinkedListTest {
    
    public SinglyLinkedListTest() {
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
     * Converts a singly linked list to an array.
     * 
     * @param list  the list to convert
     * @return      the converted list
     */
    private static int[] singlyLinkedListToArray(SinglyLinkedList list) {
        // Gauge size.
        int n = 0;
        ListNode c = list.head;
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
    
//     /**
//     * Test of getSize method, of class SinglyLinkedList.
//     */
    @Test
    public void testGetSize() {
        // Create instance of size 3.
        SinglyLinkedList instance = new SinglyLinkedList(new int[] {2, 4, 6});
        // Compare to expected.
        assertEquals("List size should be returned correctly.", 3, 
                instance.getSize());
    }
//    
//    
//    /**
//     * Test of addFirst method, of class SinglyLinkedList.
//     */
    @Test
    public void testgetSecond() {
        // Create instance and return the second item.
        SinglyLinkedList instance = new SinglyLinkedList(new int[] {2, 4, 6});
        //instance.addFirst(3);
        //instance.addFirst(6);
        // Compare to expected.
                assertEquals("Second item should be returned correctly.", 4, 
                instance.getSecond());
    }
//
//    /**
//     * Test of getAtPos method, of class SinglyLinkedList.
//     */
    @Test
    public void testGetAtPos() {
        // Create instance.
        SinglyLinkedList instance = new SinglyLinkedList(new int[] {5, 8, 9});
        // Compare to expected.
        assertEquals("Correct item should be retrieved from index 0.", 5, 
                instance.getAtPos(0));
        assertEquals("Correct item should be retrieved from index 2.", 9, 
                instance.getAtPos(2));
    }
//    
//    /**
//     * Test of addLast method, of class SinglyLinkedList.
//     */
    @Test
    public void testAddLast() {
        // Create instance, insert 4 and 2 at last position.
        SinglyLinkedList instance = new SinglyLinkedList(new int[] {8, 8, 0});
        instance.addLast(4);
        instance.addLast(2);
        // Compare to expected.
        assertArrayEquals("Items should be correctly added.", 
                new int[] {8, 8, 0, 4, 2}, singlyLinkedListToArray(instance));
    }
//    
//    
//    /**
//     * Test of addAfterPos method, of class SinglyLinkedList.
//     */
    @Test
    public void testAddAfterPos() {
        // Create instance, insert 3 and 6 at third and fourth position.
        SinglyLinkedList instance = new SinglyLinkedList(new int[] {2, 4, 6});
        boolean success = instance.addAfterPos(3, 1) 
                && instance.addAfterPos(6, 2);
        assertTrue("True should return on success.", success);
        boolean failure = instance.addAfterPos(6, 99);
        assertFalse("False should return on failure.", failure);
        // Compare to expected.
        assertArrayEquals("Items should be correctly added.", 
                new int[] {2, 4, 3, 6, 6}, singlyLinkedListToArray(instance));
    }
//    
//    
}
