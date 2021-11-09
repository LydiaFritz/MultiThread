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
		// TODO Auto-generated method stub

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
