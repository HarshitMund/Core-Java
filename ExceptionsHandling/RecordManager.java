package ExceptionsHandling;

public class RecordManager {

	private int[] records = new int[5];
	private int count = 0;

	public void addRecord(int id) throws DuplicateRecordException {

		for (int i = 0; i < count; i++) {
			if (records[i] == id) {
				throw new DuplicateRecordException("Record with ID " + id + " already exists");
			}
		}

		records[count] = id;
		count++;

		System.out.println("Record added: " + id);
	}

}
