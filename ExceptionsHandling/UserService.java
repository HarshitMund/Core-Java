package ExceptionsHandling;

public class UserService {

	private String role;

	public UserService(String role) {
		this.role = role;
	}

	public void deleteUser() {
		if (!role.equals("ADMIN")) {
			throw new AccessDeniedException("Only ADMIN can delete user");
		}

		System.out.println("User deleted successfully");
	}

}
