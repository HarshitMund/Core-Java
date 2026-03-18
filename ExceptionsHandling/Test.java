package ExceptionsHandling;

public class Test {

	public static void main(String[] args) throws DuplicateRecordException {

        RecordManager rm = new RecordManager();

        rm.addRecord(1);
        rm.addRecord(2);
        rm.addRecord(1); 

        UserService user = new UserService("USER");
        user.deleteUser(); 
    }
	
}
