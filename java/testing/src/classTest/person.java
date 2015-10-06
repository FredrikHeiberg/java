package classTest;

public class person implements personInterface {

	private String fName;
	private String lName;
	private int a;

	public person() {
		fName = getFirstName();
		lName = getLastName();
		a = getAge();
	}
	
	public int getAge() {
		// TODO Auto-generated method stub
		return a;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return lName;
	}

	public String getFirstName() {
		return fName;
	}
	
	public void setFirstName(String name) {
		fName = name;
	}
	
	public void setLastName(String name) {
		lName = name;
	}
	
	public void setAge(int age) {
		a = age;
	}
}
