/**
 * Exception, when Stack is empty
 * @author Marcel Ebner
 * @version 2026-02-10
 */
public class StackEmptyException extends RuntimeException {

    // Constructor with custom message
    public StackEmptyException(String message) {
        super(message);
    }

    // Default error message
    @Override
    public String getMessage() {
        return "Stack is empty";
    }
}
