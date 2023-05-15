package uk.ac.tees.linkedlistica;

/**
 * The project main class (intentionally empty).
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 * @since 23/01/2020
 */
public class LinkedListICA {

    /**
     * The entry point for your program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* This main method is intentionally left blank. You should test your
         * code using the unit tests provided, and/or write your own if you're
         * feeling up to it. You may also write code here to test your ADTs.
         */
        int [] a = {1, 3, 4, 6, 7};
        SinglyLinkedList l  = new SinglyLinkedList(a);
        ListNode c = l.head.next;
        while (c!= null){
            System.out.println(c.data + " ");
            c = c.next;
        }
        
        System.out.println("");
        SinglyLinkedList l2 = new SinglyLinkedList(a);
        System.out.println("" );
        
    
    }
    
}
