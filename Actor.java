
public class Actor {
	String firstname;
	String lastname;

public Actor(String firstname, String lastname) {
	this.firstname=firstname;
	this.lastname=lastname;
}

private String getFirstname() {
	return firstname;
}

private void setFirstname(String firstname) {
	this.firstname = firstname;
}

private String getLastname() {
	return lastname;
}

private void setLastname(String lastname) {
	this.lastname = lastname;
}

}
