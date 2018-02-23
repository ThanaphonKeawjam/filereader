package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * A class uses for computes elapsed time between a start and stop time.
 * @author Thanaphon Keawjam
 */
public class StopWatch {
	
	private static final double NANOSECOND = 1.0E-9;
	private long startTime = 0;
	private long stopTime = 0;
	private boolean running;
	
	/**
	 * If the stopwatch is running, then return the time since start() until the current time.
	 * If stopwatch is stopped, then return the time between the start and stop times.
	 * @return the elapsed time in seconds, as accurately as possible.
	 */
	public double getElapse(){
		if(running) return (System.nanoTime() - startTime) * NANOSECOND;
		else return (stopTime - startTime) * NANOSECOND;
	}
	
	/**
	 * Return status of stopwatch.
	 * @return true if the stopwatch is running, false if stopwatch is stopped. 
	 */
	public boolean isRunning(){
		return running;
	}
	
	/**
	 * Reset the stopwatch and start if if stopwatch is not running.
	 * If the stopwatch is already running then start does nothing. 
	 */
	public void start(){
		if(running) return;
		startTime = System.nanoTime();
		running = true;
	}
	
	/**
	 * Stop the stopwatch. 
	 * If the stopwatch is already stopped, then stop does nothing. 
	 */
	public void stop(){
		if(!running) return;
		stopTime = System.nanoTime();
		running = false;
	}
	
	/*
	public static String readFileToString(String filename){
		String data = "";
		InputStream in = null;
		
		try{
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			
			int c;
			while(true){
				c = reader.read();
				if(c < 0) break;
				data = data + (char)c;
			}
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		
		if(in != null)
			try{
				in.close();
			}catch(IOException ioe){}
		
		return data;
	}
	
	public static String readFileToStringBuilder(String filename){
		StringBuilder data = new StringBuilder();
		InputStream in = null;
		
		try{
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			
			int c;
			while(true){
				c = reader.read();
				if(c < 0) break;
				data = data.append((char)c);
			}
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		
		if(in != null)
			try{
				in.close();
			}catch(IOException ioe){}
		
		return data.toString();
	}
	
	public static String readFileToStringWithBufferReader(String filename){
		String data = "";
		InputStream in = null;
		
		try{
			in = new FileInputStream(filename);
			InputStreamReader read = new InputStreamReader(in);
			BufferedReader reader = new BufferedReader(read);
			
			int c;
			while(true){
				c = reader.read();
				if(c < 0) break;
				data = data + (char)c;
			}
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		
		if(in != null)
			try{
				in.close();
			}catch(IOException ioe){}
		
		return data;
	}
	
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to String.");
		sw.start();
		String readToString = readFileToString("src/filereader/Alice.txt"); 
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n", readToString.length(), sw.getElapse());
		
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.");
		sw.start();
		String readToStringBuilder = readFileToStringBuilder("src/filereader/Alice.txt"); 
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n", readToStringBuilder.length(), sw.getElapse());
		
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to lines to String");
		sw.start();
		String readToStringWithBuffer = readFileToStringWithBufferReader("src/filereader/Alice.txt"); 
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n", readToStringWithBuffer.length(), sw.getElapse());
		
	} */

}
