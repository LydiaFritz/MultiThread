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
		
		//Create threads
		Thread threadA = new Thread(printA);
		Thread threadB = new Thread(printB);
		Thread threadC = new Thread(print1);
		
		//start them up
		threadA.start();
		threadB.start();
		threadC.start();

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
