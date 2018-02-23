package filereader;

public class TaskTimer{
	
	public static void measureAndPrint(Runnable runnable){
		System.out.println(runnable);
		StopWatch sw = new StopWatch();
		sw.start();
		runnable.run();
		sw.stop();
		System.out.printf("Read chars in %.6f sec.\n", sw.getElapse());
	}

}
