package classTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class generatePerson {

	public static void main(String[] args) {
		generatePerson gp = new generatePerson();
		person p = new person();	
		p.setFirstName(gp.inputName());
		System.out.println(p.getFirstName());
//		p.setFirstName("Fredrik");
//		p.setLastName("Heiberg");
//		p.setAge(24);
//		System.out.println(p.getFirstName());
//		System.out.println(p.getLastName());
//		System.out.println(p.getAge());
		
	}
	
	public String inputName() {
		Scanner user_input = new Scanner(System.in);
		String firstName = user_input.next();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String firstName = br.readLine();
		return firstName;
	}
}
