import java.util.ArrayList;
import java.lang.Runnable;

public class SmallTest {

	public static void main(String[] args) {
		
		ArrayList<String> liste = new ArrayList<String>();
		
		liste.add("Fredrik");
		liste.add("Camilla");
		liste.add("Liss Heidi");
		liste.add("Christen");
		
		for (Object element : liste) {
			System.out.println(element);
		}
		
		 Runnable r1 = new Runnable(){

			 public void run(){
				 System.out.println("Hello world one!");
			 }
		 };
		
		Runnable r2 = () -> System.out.println("Hello world two!");
     // Run em!
		r1.run();
		r2.run();
		
		Runnable r = () -> System.out.println("hello world");
	}
}
