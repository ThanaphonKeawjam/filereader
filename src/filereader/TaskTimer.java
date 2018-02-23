package filereader;

/**
 * A class used for measures and prints its running time to the console.
 * @author Thanaphon Keawjam
 */
public class TaskTimer{
	
	/**
	 * Runs a task, measures and prints its running time to the console.
	 * @param runnable is object type runnable.
	 */
	public static void measureAndPrint(Runnable runnable){
		System.out.println(runnable);
		StopWatch sw = new StopWatch();
		sw.start();
		runnable.run();
		sw.stop();
		System.out.printf("Read chars in %.6f sec.\n", sw.getElapse());
	}

}
