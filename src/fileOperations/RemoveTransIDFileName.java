package fileOperations;

import java.io.BufferedReader;
import java.io.File;

public class RemoveTransIDFileName {

	public static void main(String[] args) {
		String DirectoryPath = "C:\\Users\\NITHISH\\Documents\\Directory";
		File Directory = new File(DirectoryPath);
		
		if(Directory.isDirectory()){
			System.out.println("LIST OF FILES IN DIRECTORY:::::::::");
			for(File file: Directory.listFiles()){
				String previousName = file.getName();
				System.out.println(previousName);
				String newName = previousName.substring(previousName.indexOf("_")+1);
				System.out.println(newName);
				file.renameTo(new File(Directory+"\\"+newName));
				
			}
		}
		else{
			new RuntimeException("PATH specified is not a DIRECTORY");
		}
		
	}

}