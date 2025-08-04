# Algorithms and Data Structures – Linked List Solutions

This project contains solutions to various linked list problems as part of a first year university module in Algorithms and Data Structures. The code is written in Java and demonstrates implementations of three core types of linked lists:

- **Singly Linked List**
- **Doubly Linked List**
- **Circular Linked List**

<img width="500" height="500" alt="Create a cartoonish " src="https://github.com/user-attachments/assets/0cc82a70-c3a7-4eb0-84f2-60c27d96e61c" />


## Structure

The main implementations can be found in the `src/uk/ac/tees/linkedlistica/` directory:

- `SinglyLinkedList.java`  
  Basic singly linked list operations such as insertion, retrieval by index, adding at the end, and more.
- `DoublyLinkedList.java`  
  Implementation of a doubly linked list with forward and backward traversal, node counting, searching, and insertion at a specific position.
- `CircularLinkedList.java`  
  Circular linked list supporting operations like deletion of nodes by value, deletion at a specific position, and appending another list.
- `ListNode.java` and `DoublyLinkedListNode.java`  
  Node classes used by the respective list implementations.

## Example Usage

The file `LinkedListICA.java` contains example usage for testing the different linked list classes. You can modify the `main` method to try out various operations.

## How to Build and Run

This project uses standard Java (JDK 8 or later).  
To compile and run from the command line:

```sh
javac src/uk/ac/tees/linkedlistica/*.java
java -cp src uk.ac.tees.linkedlistica.LinkedListICA
```

You can also use an IDE like NetBeans, IntelliJ IDEA or Eclipse.

## Educational Value

- Understanding node-based data structures
- Implementing and manipulating linked lists
- Traversing, searching, inserting, and deleting in various linked list types

## Author

- James Fothergill

## Licence

This project is for educational purposes only.

---

For more information, review the source files in the `src/uk/ac/tees/linkedlistica/` directory.
