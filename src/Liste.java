public class Liste<T> {

    // Array to store stack elements
    public Object[] array;

    // Current number of elements in the stack
    public int size;

    // Default constructor
    public Liste() {
        array = null;
        size = 0;
    }

    /**
     * Constructor with stack size
     * @param groesse Size of array
     */
    public Liste(int groesse) {
        array = new Object[groesse];
        size = 0;
    }

    // Push an element onto the stack
    public void push(T element) {

        // Check if stack is full
        if (size == array.length) {
            throw new StackFullException("Stack is full");
        }

        // Add element and increase size
        array[size] = element;
        size++;
    }

    /**
     * Remove and return the top element
     * @return What you deleted
     */
    public T pop() {
        // Check if stack was initialized
        if (array == null) {
            throw new IllegalStateException("Stack not initialized. Use Liste(int groesse).");
        }

        // Check if stack is empty
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }

        // Index of the top element
        int topIndex = size - 1;

        // Cast Object back to type T
        T ausgabe = (T) array[topIndex];

        // Remove element and decrease size
        array[topIndex] = null;
        size--;

        return ausgabe;
    }

    /**
     * Return the top element without removing it
     * @return What you peeked at
     */
    public T peek() {

        // Check if stack is empty
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }

        // Index of the top element
        int topIndex = size - 1;

        // Cast Object back to type T
        T value = (T) array[topIndex];

        return value;
    }

    /**
     * Return all elements as a String separated by ;
     * @return A list with every element with a ;
     */
    public String list() {
        // Return empty string if stack is not initialized
        if (array == null) {
            return "";
        }

        String ausgabe = "";

        // Go through all elements in the stack
        for (int i = 0; i < size; i++) {
            ausgabe += array[i];

            // Add separator between elements
            if (i < size - 1) {
                ausgabe += "; ";
            }
        }

        return ausgabe;
    }
}
