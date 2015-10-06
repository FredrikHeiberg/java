package testing;

public class fastTest extends legoKloss {
	
	public static void main(String args[]) {
		delTo dt = new delTo();
		fastTest ft = new fastTest();
		legoKloss lk = new legoKloss();
		System.out.println(lk);
	    ft.fib();
		//System.out.println(ft.testCorrect());
		//System.out.println(dt.testObject());
	}
	
	public boolean testCorrect() {
		int number = 0;
		number = randomNumber();
		if (number >= 10) {
			return true;
		}
		return false;
	}
	
	public int randomNumber() {
		int number = 0;
		for (int i = 0; i < 100; i++) {
			number = i;
		}
		return number;
	}
	
	public void fib() {
		int old = 0;
		int current = 1;
		int temp = 0;
		
		
		
		for (int i = 0; i < 10; i++) {
			if (old < 1) {
				System.out.println(old);
				old ++;
				System.out.println(old);
				System.out.println(current);
			}
			else {
				System.out.println(old+current);
				temp = current;
				current = old + current;
				old = temp;
			}
		}
	}
}
