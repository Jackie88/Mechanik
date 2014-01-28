package CommandFinder;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class fileReader {
	private String path;
	
	public fileReader(String file_path){
		path = file_path;
	}
	
	public String[] sectionFinder(String partName) throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader textRead = new BufferedReader(fr);
		String aLine = new String("");
		String allComs = new String("");
		
		while(!aLine.equals(partName)){
			aLine = textRead.readLine();
		}
		aLine = textRead.readLine();
		while(!aLine.equals("END")){
			allComs += aLine;
			aLine = textRead.readLine();
		}
		
		String[] textData = allComs.split(";");
		textRead.close();
		
		return textData;
	}

}
