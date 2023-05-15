package uk.ac.tees.linkedlistica;

/**
 * Represents a circular linked list.
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 * @since 23/01/2020
 */
public class CircularLinkedList {
    
    /**
     * Stores the first node in the list. Should always be a sentinel node.
     */
    public ListNode head;
    
    /**
     * Creates a new circular linked list from an existing array.
     *
     * @param data  the array to create the new linked list from
     */
    public CircularLinkedList(int[] data) {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        // The head is a sentinel node.
        head = new ListNode(-999, null);
        head.next = head; // Complete the circle.
        
        // Populate list.
        ListNode n = head; // The last item in the circle.
        for (int i = 0; i < data.length; i++) {
            n.next = new ListNode(data[i], head);
            n = n.next;
        }
    }
    
    
    /**
     * Gets the length of the circular linked list.
     * @return  the length
     */
    public int getSize() {
        if(head.next==head) //if list is empty return 0
            return 0;
        else{
            ListNode c = head;
            int counter = 0;
            while(c.next!=head){ //while next node is not head count nodes
                c = c.next;
                counter++; // add to counter (each count is one node)
            }
            return counter;
        }
    }
    
    /**
     * Gets the last item in the circular linked list, or -999 if not found.
     * @return  the last item, or -999 if empty
     */
    public int getLast() {
         if(head.next==head)
             return -999; // if list is empty return -999
         else{
             ListNode c = head.next;
             while (c.next!=head){ //while next node is not the head (end of list)
                 c = c.next; // move to next node
             }
             return c.data; //return the node before the head
         }
    }
    
    
     /**
     * Deletes all nodes with the given value, returning the number of nodes
     * deleted.
     * @param obj   the value
     * @return      the number of nodes deleted
     */
    public int deleteAllNodesWithValue(int obj) {
         int deleted = 0; //deleted counter
         ListNode c = head.next; 
         while (c.next!=head){
             if(c.next.data == obj){  // if next node's data matches obj
                 ListNode toDelete = c.next; //set obj node toDelete
                 c.next = toDelete.next; //link to the node after deleted
                 toDelete = null; // set deleted nude to null
                 deleted++; // add to deleted counter
             }
             c = c.next;
         }
         return deleted;
    }
    
    
     /**
     * Deletes the node in the list at the specified index.
     * @param index the index
     * @return      true if successful, otherwise false
     */
    public boolean deleteAtPos(int index) {
         ListNode c = head.next;
         while(c.next!=head)
             if(c.next.data==index){
                 ListNode toDelete = c.next;
                 c.next = toDelete.next;
                 c.next = toDelete;
                 toDelete = null;
                 return true;
             }
         return false;
    }
    
    
    
     /**
     * Appends a singly linked list to this circular linked list.
     * @param list  the singly linked list to append
     */
    public void appendSinglyLinkedList(SinglyLinkedList list) {
       ListNode c = this.head;
       ListNode p = list.head;
       while(c.next!=head)
           c = c.next;
       while(p!=null){
           ListNode n =  new ListNode(p.data);
           c.next = n;
           n.next = head;//
           c = c.next;
           p = p.next;
       }
    }
    
    
    
    
     /**
     * Returns the sum of all values in the list.
     * @return  the sum
     */
    public int sum() {
       int total = 0; // value for addition
       ListNode current = head.next;
       if(head.next==head){
           return 0; // if the list is empty return 0
       } 
       else{
        
       while (current!= head){ 
           
           total = total + current.data; //add current to the total
           current = current.next; //move to next node
           
       }
       return total; //return total of all nodes
    
       }
    }

}
