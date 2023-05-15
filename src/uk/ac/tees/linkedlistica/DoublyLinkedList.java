package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 * @since 23/01/2021
 */
public class DoublyLinkedList {
    
    /**
     * Stores the first node in the list.
     */
    public DoublyLinkedListNode head;
      
    /**
     * Creates a new doubly linked list from an existing array.
     * @param data  the array to create the new linked list from
     */
    public DoublyLinkedList(int[] data) {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
           
        for (int i = data.length - 1; i >= 0; i--) {
            DoublyLinkedListNode n = new DoublyLinkedListNode(data[i], head, 
                    null);
            if (head != null) {
                head.prev = n;
            }
            head = n;
        }
    }
    
    
    /**
     * Gets whether or not the list is empty.
     * @return  true if list is empty, otherwise false
     */
    public boolean isEmpty() {
         //return head == null; //if head is null then list is empty and return true
         if(head==null)
             return true;
         else
             return false;
    }
    
    
    /**
     * Returns the list as a string of the form "{item1, item2, ...}"
     * @return  the resulting string
     */
    @Override
    public String toString() {
        DoublyLinkedListNode c = head;
        String s = "{";
        while(c!=null){
            s = s + c.data + ", ";
            c = c.next; //moving c to next
        }
        return s.replaceAll(", $", "")+"}";
    }
    
    
     /**
     * Count all nodes with the given value, returning the number of nodes.
     * @param obj   the value
     * @return      the number of nodes with value obj
     */
    public int countNodesWithValue(int obj) {
        int count = 0;
        DoublyLinkedListNode c = head;
        if (c==null){
            return -999; // if list is empty return - 999
        }
        else{
            
        while(c != null ){
            if(c.data == obj){
                count++;      // add to counter          
            }
            c = c.next;  
    }
        }
        return count;
        
    }
    
    
         /**
     * Count all nodes with the given value, returning the number of nodes.
     * @param obj   the value
     * @return      the number of nodes with value obj
     */
    public int searchIndex(int obj) {
        DoublyLinkedListNode c = head;
        int index = 0;
        while(c.next !=head){
            if(c.data == obj){
               return index; 
            }
            c = c.next;
            index++;
    
        }

        return -999;
    }
   
    
    
    
    /**
     * Adds an item after a specified index in the list.
     * @param obj   the item to add
     * @param index the index
     * @return      true if successful, otherwise false
     */
    public boolean addAtPos(int obj, int index) {

        DoublyLinkedListNode c = head;
        int counter = 1;
        while(counter!=index){
            c = c.next;
            counter++; 
        }
        if(c==null)
            return false;
        else{
            DoublyLinkedListNode n = new DoublyLinkedListNode(obj);
            DoublyLinkedListNode succ = c.next;
            n.next = succ;
            n.prev = c;
            c.next = n;
            if(succ!=null){
            succ.prev = n;
            }
            return true;
        }
      
    }
    
    
     /**
     * Deletes any node containing a value that is a multiple of three.
     * @return 
     */
    public int deleteMultiplesOfThree() {
         int num = 0;
         DoublyLinkedListNode c = head; 
         while (c.next!=null){
             c = c.next;
             if(c.next.data == num %3){  // if next node's data is /3
                 DoublyLinkedListNode toDelete = c.next; //set obj node toDelete
                 c.next = toDelete.next; //link to the node after deleted
                 toDelete = null; // set deleted nude to null

             }
             c = c.next;
         }
         return num;
    }
    
    
    
    
    /**
     * Adds an item to the end of the list.
     * @param obj   the item
     */
    public boolean addSecondLast(int obj) {
         
        if(head.next==null){
            return false;
         }
         else{
             DoublyLinkedListNode c = head;
             while(c.next.next!=null )
             c = c.next;
             
             DoublyLinkedListNode n = new DoublyLinkedListNode(obj);
             n.prev = c.prev.prev;
             c.prev = n;
             n.next = c;
    
         }
         return true;
    }
    
}
