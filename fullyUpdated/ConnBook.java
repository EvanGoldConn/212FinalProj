import java.util.Calendar;

public class ConnBook{
	private PriorityQueue events;
	private HashTable personTable;

	public ConnBook(){
		events = new PriorityQueue();
		personTable = new HashTable();
	}

	public void addPerson(String firstName, String lastName, String email, int year, String password){
		Person pname = new Person(firstName, lastName, email, year, password);
		personTable.addPerson(pname);
	}

	public void deleteAccount(String firstName, String lastName, String email, int year, String password){
		Person pname = new Person(firstName, lastName, email, year, password);
		personTable.deleteAccount(pname);
	}

	public void addEvent(Calendar userCal, String event){
		events.insertEvent(userCal, event);
	}

	public Person login(String email, String password){
		Person person = personTable.findPerson(email, password);
		return person;
	}



}//priority queue & hashTable located here 


class test{
	public static void main(String[] args){
		//main method goes here

		ConnBook book = new ConnBook();
		book.addPerson("Justin", "T", "jturbevil@conncoll.edu", 2022, "password");
		//how do we access the person object thats located in the hash table, in order to get all the methods in Person.java?
		Person justin = book.login("jturbevil@conncoll.edu", "password");
		System.out.println(justin.getLastName());
		justin.addTimelinePost("This finally works!", "Justin");
		justin.addTimelinePost("I'm hungry!", "Justin");
		justin.addTimelinePost("Testing...", "Justin!");
		justin.displayTimeline(5);


	}

}