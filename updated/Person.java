import java.util.Calendar;
public class Person {

    private String firstName;
    private String lastName;
    public PriorityQueue events;
    private ClassYear gradYear;
    private Email email;
    private Password pass;
    private Timeline timeline;
    private TempFriends friends;

    public Person(String f, String l, String e, int y, String p) {
        firstName = f;
        lastName = l;
        email.newEmail(e);
        events = new PriorityQueue();
        gradYear.setYear(y);
        pass.newPassword(p);
        timeline = new Timeline();
        friends = new TempFriends();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email.getEmail();
    }

    public String getEmailKey() {
        return email.getKey();
    }

    public int getYear() {
        return gradYear.getYear();
    }

    public String getPassword() {
        return pass.getPassword();
    }

    public void addTimelinePost(String v, String c) {
        timeline.addPost(v, c);
    }

    public void displayTimeline(int n) {
        timeline.displayTimeline(n);
    }

    public void loginTimeline() {
        timeline.loginTimeline();
    }

    public void addFriend(Person p) {
        friends.addFriend(p);
    }

    public void findFriend(String f, String l) {
        friends.find(f, l);
    }

    public Person removeFriend(String f, String l) {
        return friends.remove(f, l);
    }

    public void insertEvent(Calendar date, String event) {
        events.insertEvent(date, event);
    }

    public void displayEvents() {
        events.displayEvents();
    }
}

class PersonTest {
    Person me = new Person("Justin", "T", "jturbevil", 2022, "password");
}
