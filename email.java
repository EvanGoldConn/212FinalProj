public class email {
	private String email;
	
	public email() {
		email = "";
	}
		
	public String getEmail() {
		return email;
	}
	
	public int getKey() {
		//convert email to a specific ID/ascii number
	}
	
	public void displayEmail() {
		System.out.println(email);
	}
	
	public void newEmail() {
		Scanner newE = new Scanner(System.in);
		System.out.println("Enter a new email.");
		email = newE.next();
	}
	
	public void changeEmail() {
		if (email == "") {
			System.out.println("You don't have an email saved to your account.");
			newEmail();
		else {
			Scanner changeE = new Scanner(System.in);
			System.out.println("Enter your current email to change it.");
			if (changeE == email){
				Scanner change = new Scanner(System.in);
				System.out.println("Change email to: ");
				email = change.next();
			}
			else {
				System.out.println("Incorrect email.");
				changeEmail();
			}
		}
	}
}
