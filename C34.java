// operation on the single circular linked list

public class C34  {
 
        // Node class for Circular Linked List
        static class Node {
            int data;
            Node next;
        }
    
        // Add a node to an empty list
        static Node addToEmpty(Node last, int data) {
            if (last != null)
                return last;
    
            Node newNode = new Node();
            newNode.data = data;
            last = newNode;
            newNode.next = last; // Point to itself as it's the only node
            return last;
        }
    
        // Add a node to the front of the list
        static Node addFront(Node last, int data) {
            if (last == null)
                return addToEmpty(last, data);
    
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = last.next;
            last.next = newNode;
            return last;
        }
    
        // Add a node to the end of the list
        static Node addEnd(Node last, int data) {
            if (last == null)
                return addToEmpty(last, data);
    
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
            return last;
        }
    
        // Add a node after a given node
        static Node addAfter(Node last, int data, int item) {
            if (last == null)
                return null;
    
            Node newNode, p;
            p = last.next;
            do {
                if (p.data == item) {
                    newNode = new Node();
                    newNode.data = data;
                    newNode.next = p.next;
                    p.next = newNode;
    
                    // If the new node is added after the last node, update `last`
                    if (p == last)
                        last = newNode;
                    return last;
                }
                p = p.next;
            } while (p != last.next);
    
            System.out.println("The given node " + item + " is not present in the list");
            return last;
        }
    
        // Delete a node from the list
        static Node deleteNode(Node last, int key) {
            if (last == null)
                return null;
    
            // If the list contains only a single node
            if (last.data == key && last.next == last) {
                last = null;
                return last;
            }
    
            Node temp = last, d;
    
            // If the node to be deleted is the last node
            if (last.data == key) {
                while (temp.next != last) {
                    temp = temp.next;
                }
                temp.next = last.next;
                last = temp.next;
                return last;
            }
    
            // Traverse the list to find and delete the node
            while (temp.next != last && temp.next.data != key) {
                temp = temp.next;
            }
    
            // If the node to be deleted is found
            if (temp.next.data == key) {
                d = temp.next;
                temp.next = d.next;
            }
    
            return last;
        }
    
        // Traverse the list and print the elements
        static void traverse(Node last) {
            if (last == null) {
                System.out.println("List is empty.");
                return;
            }
    
            Node p = last.next; // Start from the first node
            do {
                System.out.print(p.data + " ");
                p = p.next;
            } while (p != last.next);
            System.out.println();
        }
    
        // Main method
        public static void main(String[] args) {
            Node last = null;
    
            // Add elements to the Circular Linked List
            last = addToEmpty(last, 6);
            last = addEnd(last, 8);
            last = addFront(last, 2);
            last = addAfter(last, 10, 2);
    
            System.out.println("Circular Linked List after insertion:");
            traverse(last);
    
            // Delete a node
            last = deleteNode(last, 8);
            System.out.println("Circular Linked List after deleting 8:");
            traverse(last);
        }
    }
    