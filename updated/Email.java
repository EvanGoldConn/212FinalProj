public class Email {
	private String email;
	
	public Email() {
		email = "";
	}
		
	public String getEmail() {
		return email;
	}
	
	public String getKey() {
		int i = 0;
		String emailKey = "";
		while(email.charAt(i) != '@'){
			emailKey += email.charAt(i);
			i++;
		}
		return emailKey;
	}
	
	public void displayEmail() {
		System.out.println(email);
	}
	
	public void newEmail(String e) {
// 		Scanner newE = new Scanner(System.in);
// 		System.out.println("Enter a new email.");
		email = e;
	}
	
	public void changeEmail(String newE) {
		email = newE;
		System.out.print("Your email was successfully changed to: " + email);
			
	}
}
