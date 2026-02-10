/**
 * Exception, when Stack is empty
 * @author Marcel Ebner
 * @version 02-10-2026
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
