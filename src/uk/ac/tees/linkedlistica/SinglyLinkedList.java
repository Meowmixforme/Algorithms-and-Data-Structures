package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 * @since 23/01/2021
 */
public class SinglyLinkedList {
    
    /**
     * Stores the first node in the list.
     */
    public ListNode head;
    
    /**
     * Creates a new singly linked list from an existing array.
     * @param data  the array to create the new linked list from
     */
    public SinglyLinkedList(int[] data) {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        // Populate list.
        for (int i = data.length - 1; i >= 0; i--) {
            head = new ListNode(data[i], head);
        }
    }
    
    /**
     * Creates a new, empty singly linked list.
     */
    public SinglyLinkedList() {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        this(new int[] {});
    }
    
    /**
     * Gets the length of the doubly linked list.
     * @return  the length
     */
    public int getSize() {
         if (head==null) // if list is empty return 0
             return 0;
         else{
             int counter=1; // counter 
             ListNode current = head;
             while (current.next!=null){ // while next is not null
                 counter++;//add to counter
                 current = current.next; //traverse list one forward
             }
             return counter; // return counter with size of nodes
         }
         
    }
    
    
    /**
     * @return the second item of the list.
     *         or -999 if there is only one item
     */
    public int getSecond() {
        if (head.next==null) // if node after head is equal to (null) empty return -999
            return - 999;
        else{
            return head.next.data; //data of second node
        }
    }
    
    /**
     * Gets the item at the specified index in the list.
     * @param index the index
     * @return      the item, or -999 if not found
     */
    public int getAtPos(int index) {
         ListNode current = head;
         int counter = 0;
         while (current != null){ 
             if (counter == index) // if counter matches index
                 return current.data; //return the data in position index
             counter++; //add to counter
             current = current.next; //traverse list
         }
         return -999; // if item is not found return -999
    }
    
    
    /**
     * Adds an item to the end of the list.
     * @param obj   the item
     */
    public void addLast(int obj) {
         if(head==null){
             ListNode n = new ListNode(obj);
             head = n;
         }
         else{
             ListNode n = new ListNode(obj);
             ListNode c = head;
             while(c.next!=null){ //while next node is not null
                 c = c.next;      // traverse list           
             }
             c.next = n; // if next is null add n after current node
             
         }
              
    }
    
    
    /**
     * Adds an item after a specified index in the list.
     * @param obj   the item to add
     * @param index the index
     * @return      true if successful, otherwise false
     */
    public boolean addAfterPos(int obj, int index) {
        ListNode n = new ListNode(obj);
        ListNode c = head;
        int counter = 0;
        while(counter!=index && c.next!=null){
            c = c.next;
            counter++; 
        }
        if(c.next==null)
            return false;
        else{
            n.next = c.next;
            c.next = n;     
        }
      return true;
    }
    
    
    
    /**
     * Reverses the order of this linked list.
     */
    public void reverseOrderLinkedList() {
        
    ListNode one = null;
    ListNode current = head;
    ListNode two = null;
    
    while (current != null){ //this will continue until it reaches null
        two = current.next; //copy next node
        current.next = one; //move one to next node
        one = current; //copy  current node to one
        current = two; //make the current two
        
       }
     
    }
    
    
    /**
     * Multiply every nth node by factor
     * @param fact - factor to multiply by
     */
    public int multiplyEveryOtherNodeByFactor(int fact) {
        fact = 15;
        ListNode c = head;
        
        while (c.next!=null) {
         int temp = 0;   
         c = c.next.next;   
         temp = fact * c.data;
         c.data = temp;
         temp = 0;
         
         
    }
     return  c.data;  
  }
    
    
}
