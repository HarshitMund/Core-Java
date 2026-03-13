package ExceptionsHandling;

public class MultipleException {

	public static void main(String[] args) {
		
		String s= null;
		
		try {
			
			System.out.println(s.length());
			System.out.println(s.charAt(5));
			
		} catch (NullPointerException e) {
			
			System.out.println(e.getMessage());
			
		} catch (IndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}
