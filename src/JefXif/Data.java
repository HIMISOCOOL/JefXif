/**
 * 
 */
package JefXif;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.FileSystems;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/**
 * @author Real Standard Studios - Matthew Meehan
 * @description A static Class that reads and writes other objects
 */
public class Data {
	private static final Kryo kryo = new Kryo();
	private static Input input;
	private static Output output;

	final static String FileDirectory = "Files";

	public File[] files = new File(FileSystems.getDefault()
			.getPath(FileDirectory).toString()).listFiles();;

	public static boolean Write(String FileName, Object Data) throws FileNotFoundException {
		boolean result = true;
		
		output = new Output(new FileOutputStream(FileDirectory + "/"
				+ FileName + ".cdf"));
		kryo.writeObject(output, Data);
		if(output!=null)output.close();
		return result;
	}

	public static <T> T Read(String FileName, Class<T> Class)
			throws FileNotFoundException {
		input = new Input(new FileInputStream(FileName));
		T result = kryo.readObject(input, Class);
		if (input != null)
			input.close();
		return result;
	}
}
