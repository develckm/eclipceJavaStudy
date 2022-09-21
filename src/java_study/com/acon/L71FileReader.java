package java_study.com.acon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L71FileReader {
	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		StringBuffer sb=new StringBuffer("");
		try {
			//fr=new FileReader("newFile.txt");
			fr=new FileReader("src/java_study/com/acon/L71FileReader.java");
			br=new BufferedReader(fr);
			String line=null;
			while((line=br.readLine())!=null) {
				sb.append(line+"\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sb);		
	}
}
