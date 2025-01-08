package week07.customusergeneration;

public class InvalidUsernameException extends Exception {

    public InvalidUsernameException() {
        super();
    }

    public InvalidUsernameException(String message) {
        super(message);
    }
}