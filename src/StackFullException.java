/**
 * Exception, when Stack is full
 * @author Marcel Ebner
 * @version 2026-02-10
 */
public class StackFullException extends RuntimeException {

    // Constructor with custom message
    public StackFullException(String message) {
        super(message);
    }

    // Default error message
    @Override
    public String getMessage() {
        return "Stack is full";
    }
}
