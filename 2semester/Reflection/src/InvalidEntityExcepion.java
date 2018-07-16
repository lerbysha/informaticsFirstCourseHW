public class InvalidEntityExcepion extends Exception{

    public InvalidEntityExcepion() {
    }

    public InvalidEntityExcepion(String message) {
        super(message);
    }

    public InvalidEntityExcepion(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidEntityExcepion(Throwable cause) {
        super(cause);
    }

    public InvalidEntityExcepion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}