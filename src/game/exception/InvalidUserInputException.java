package game.exception;

public class InvalidUserInputException extends RuntimeException {
    public InvalidUserInputException(String message) {
        super("INPUT HELPER: Invalid input: '" + message + "'");
    }
}
