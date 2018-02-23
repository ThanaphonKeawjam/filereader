package filereader;

public class Main {
	
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
