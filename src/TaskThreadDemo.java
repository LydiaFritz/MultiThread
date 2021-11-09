import java.util.Random;

/**
 * Nov 8, 2021
 * Lydia
 */

/**
 * @author Lydia
 *
 */
public class TaskThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Make some tasks
		Runnable printA = new PrintChar('w', 100);
		Runnable printB = new PrintChar('$', 200);
		Runnable print1 = new PrintNum(400);
		Runnable printRand = new Mystery();
		
		//Create threads
		Thread threadA = new Thread(printA);
		Thread threadB = new Thread(printB);
		Thread threadC = new Thread(print1);
		Thread threadD = new Thread(printRand);
		
		//start them up
		threadD.start();
		threadA.start();
		threadB.start();
		threadC.start();

	}

}

class Mystery implements Runnable{
	
	private static Random rnd = new Random();

	@Override
	public void run() {
		//print random numbers until the value 0 is generated
		int v = rnd.nextInt(100);
		while(v != 0) {
			System.out.println(v);
			v = rnd.nextInt(100);
		}
	}
	
}

class PrintChar implements Runnable{
	
	private char charToPrint;
	private int timesToPrint;
	
	

	/**
	 * @param charToPrint
	 * @param timesToPrint
	 */
	public PrintChar(char charToPrint, int timesToPrint) {
		this.charToPrint = charToPrint;
		this.timesToPrint = timesToPrint;
	}



	@Override
	public void run() {
		for(int i = 0; i < this.timesToPrint; i++)
			System.out.printf("%c",charToPrint);
		
	}
	
}

class PrintNum implements Runnable{
	
	private int lastNum;	

	/**
	 * @param lastNum
	 */
	public PrintNum(int lastNum) {
		this.lastNum = lastNum;
	}

	@Override
	public void run() {
		for(int i = 1; i <= lastNum; i++) {
			System.out.printf("%d ",i);
		}		
	}	
}
