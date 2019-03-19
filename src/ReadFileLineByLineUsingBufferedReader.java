import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLineUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filepath = "";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filepath));
			String line = reader.readLine();
			while(line!=null){
				System.out.println(line);
				line=reader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found at the Specified Path");
			e.printStackTrace();
		}
		
	}

}
