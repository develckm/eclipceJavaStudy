package java_study.com.acon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class L70FileWriter {

	public static void main(String[] args) {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw=new FileWriter("newFile.txt");//경로+파일이름
			bw=new BufferedWriter(fw);
			bw.write("안녕하세요~\n문자 기반 스트림으로 파일 작성2");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}

}
