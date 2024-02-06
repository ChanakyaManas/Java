package Orders;

public class Address {
private int id;
private String Name;
private String MailID;

public Address(int id, String name, String mailID) {
	super();
	this.id = id;
	Name = name;
	MailID = mailID;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getMailID() {
	return MailID;
}
public void setMailID(String mailID) {
	MailID = mailID;
}
}
