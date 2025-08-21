package Utils;

public class NoDriverAvailableException extends Exception{

    public NoDriverAvailableException(String message) {
        super(message);
    }

    public NoDriverAvailableException() {
        super("No Driver Available for the ride");
    }
}
