package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * A class used for read file with BufferedReader.
 * @author Thanaphon Keawjam
 */
public class TaskBufferedReader implements Runnable{
	
	private int size = readFile("src/filereader/Alice.txt").length();
	
	/**
	 * Read file from .txt with BufferedReader.
	 * @param filename is file address.
	 * @return string of file .txt.
	 */
	public static String readFile(String filename){
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

	/**
	 * When an object implementing interface Runnable is used to create a thread,
	 * starting the thread causes the object's run method
	 * to be called in that separately executing thread.
	 */
	@Override
	public void run() {
		readFile("src/filereader/Alice.txt");
	}
	
	/**
	 * Describe about reading with BufferedReader.
	 */
	@Override
	public String toString() {
		return String.format("Reading %d chars using BufferedReader, append to lines to String", size);
	}

}
