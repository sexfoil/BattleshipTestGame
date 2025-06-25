package game.exception;

public class UserExitException extends RuntimeException {
    public UserExitException(String message) {
        super("USER: " + message);
    }
}
