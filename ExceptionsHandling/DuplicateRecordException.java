package ExceptionsHandling;

public class DuplicateRecordException extends Exception {
	
	 public DuplicateRecordException() {
	        super("Record already exists");
	    }

	    public DuplicateRecordException(String message) {
	        super(message);
	    }

}
