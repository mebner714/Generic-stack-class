/**
 * Main class with executions
 * @author Marcel Ebner
 * @version 2026-02-10
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Integer Stack Test");

        // Create a stack for Integer with size 3
        Liste<Integer> intStack = new Liste<>(3);

        try {
            // Push values onto the stack
            intStack.push(10);
            intStack.push(20);
            intStack.push(30);

            // Print all elements in the stack
            System.out.println("List: " + intStack.list());

            // Show the top element without removing it
            System.out.println("Peek: " + intStack.peek());

            // Remove and print elements from the stack
            System.out.println("Pop: " + intStack.pop());
            System.out.println("Pop: " + intStack.pop());

            // Show stack after popping elements
            System.out.println("List after pop: " + intStack.list());

            // Pop last element
            System.out.println("Pop: " + intStack.pop());

            // Try to pop from an empty stack
            System.out.println("Pop: " + intStack.pop());

        } catch (StackFullException e) {
            // Stack is full
            System.out.println("StackFullException: " + e.getMessage());
        } catch (StackEmptyException e) {
            // Stack is empty
            System.out.println("StackEmptyException: " + e.getMessage());
        }

        System.out.println();

        System.out.println("String Stack Test");

        // Create a stack for String with size 2
        Liste<String> stringStack = new Liste<>(2);

        try {
            // Push values onto the stack
            stringStack.push("A");
            stringStack.push("B");

            // Print all elements in the stack
            System.out.println("List: " + stringStack.list());

            // Try to push into a full stack
            stringStack.push("C");

        } catch (StackFullException e) {
            // Stack is full
            System.out.println("StackFullException: " + e.getMessage());
        } catch (StackEmptyException e) {
            // Stack is empty
            System.out.println("StackEmptyException: " + e.getMessage());
        }
    }
}
