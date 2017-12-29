package ouestfrance.julien.summarize.exception;

public class ServerDownException extends Exception {
    private static final long serialVersionUID = 1L;

    public ServerDownException() {
        super();
    }

    public ServerDownException(String message) {
        super(message);
    }

}
