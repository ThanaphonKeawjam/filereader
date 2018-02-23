package filereader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * A class uses for read file with InputStreamReader and StringBuilder.
 * @author Thanaphon Keawjam
 */
public class TaskStringBuilder implements Runnable{
	
	private int size = readFile("src/filereader/Alice.txt").length();
	
	/**
	 * Read file from .txt with InpuStreamBuilder and StringBuilder.
	 * @param filename is file address.
	 * @return string of file .txt.
	 */
	public static String readFile(String filename){
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
	 * Describe about reading with InpuStreamReader and StringBuilder.
	 */
	@Override
	public String toString() {
		return String.format("Reading %d chars using FileReader, append to StringBuilder.", size);
	}

}
