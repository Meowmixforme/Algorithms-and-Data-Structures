package uk.ac.tees.linkedlistica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A suite of unit tests for the {@link CircularLinkedList} class.
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 * @since 23/01/2020
 */
public class CircularLinkedListTest {
    
    public CircularLinkedListTest() {
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
     * Converts a circular linked list to an array.
     * 
     * @param list  the list to convert
     * @return      the converted list
     */
    private static int[] circularLinkedListToArray(CircularLinkedList list) {
        // Gauge size.
        int n = 0;
        ListNode c = list.head.next;
        while (c != list.head) {
            n++;
            c = c.next;
        }
        // Copy to int array.
        int[] arr = new int[n];
        c = list.head.next;
        int i = 0;
        while (c != list.head) {
            arr[i++] = c.data;
            c = c.next;
        }
        return arr; // Return result.
    }
   
    /**
     * Test of getSize method
     */
   @Test
    public void testGetSize() {
        // Create instance of size 3.
        CircularLinkedList instance = new CircularLinkedList(new int[] {2, 4, 6});
        // Compare to expected.
        assertEquals("List size should be returned correctly.", 3, 
                instance.getSize());
    }

    
    /**
     * Test of getLast method
     */
    @Test
    public void testGetLast() {
        // Create instance.
        CircularLinkedList instance = new CircularLinkedList(new int[] {7, 3, 6});
        // Compare to expected.
        assertEquals("Last item should be retrieved.", 6, instance.getLast());
    }

  
     /**
     * Test of deleteAllNodesWithValue method, of class DoublyLinkedList.
     */
     @Test
    public void testDeleteAllNodesWithValue() {
        // Create instance, delete first node containing '3'.
        CircularLinkedList instance = new CircularLinkedList(new int[] {8, 3, 6, 3});
        int firstPass = instance.deleteAllNodesWithValue(3);
        assertEquals("Number of nodes deleted should be returned.", 2, 
                firstPass);
        int secondPass = instance.deleteAllNodesWithValue(6);
        assertEquals("Number of nodes deleted should be returned.", 1, 
                secondPass);
        int nullPass = instance.deleteAllNodesWithValue(99);
        assertEquals("Number of nodes deleted should be returned.", 0, 
                nullPass);
        // Compare to expected.
        assertArrayEquals("Items should be correctly deleted.", 
                new int[] {8}, circularLinkedListToArray(instance));
    }
    
    @Test
    public void testSum(){
            
            CircularLinkedList instance = new CircularLinkedList(new int[] {8, 3, 6, 3});
            
            
                assertEquals("Number of nodes deleted should be returned.", 20, 
                instance.sum());
    }
    
    
}


