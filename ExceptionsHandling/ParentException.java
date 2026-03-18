package ExceptionsHandling;

public class ParentException {
	
public static void main(String[] args) {
		
		String s= null;
		
		try {
			
			System.out.println(s.length());
			System.out.println(s.charAt(5));
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}
