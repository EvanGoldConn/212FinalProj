public class password {
	private String password;
	
	public password() {
		password = "";
	}
		
	public String getPassword() {
		return password;
	}
	
	public void newPassword(String p) {
		//Scanner newP = new Scanner(System.in);
		//System.out.println("Enter a new password.");
		password = p;
	}
	
	public void changePassword() {
		if (password == "") {
			System.out.println("You don't have a password.");
			newPassword();
		else {
			Scanner changeP = new Scanner(System.in);
			System.out.println("Enter your current password to change it.");
			if (changeP == password){
				Scanner change = new Scanner(System.in);
				System.out.println("Change password to: ");
				password = change.next();
			}
			else {
				System.out.println("Incorrect password.");
				changePassword();
			}
		}
	}
}
