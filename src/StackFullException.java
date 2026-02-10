/**
 * Exception, when Stack is full
 * @author Marcel Ebner
 * @version 02-10-2026
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
