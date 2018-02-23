package filereader;

/**
 * A main class for filereader.
 * @author Thanaphon Keawjam
 */
public class Main {
	
	/**
	 * Initialize filereader.
	 * @param args is not use.
	 */
	public static void main(String[] args) {
		Runnable[] task = {new TaskString(), new TaskStringBuilder(), new TaskBufferedReader()};
		for(Runnable run : task){
			TaskTimer.measureAndPrint(run);
		}
	/*	TaskTimer.measureAndPrint(new TaskString());
		TaskTimer.measureAndPrint(new TaskStringBuilder());
		TaskTimer.measureAndPrint(new TaskBufferedReader()); */
	}

}
