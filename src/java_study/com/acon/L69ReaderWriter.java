package java_study.com.acon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L69ReaderWriter {

	public static void main(String[] args) {
		//Reader Writer  : 자바의 문자열은 2바이트로 이루어졌기 때문에 바이트 기반 스트림으로 읽어올수 없다. 문자의 크기에 맞게 데이터를 읽을 수 있는 
		//스트림을 자바에서는 Reader Writer라 부른다.
		//InpuStreamReader : 입력받은 문자열을 읽어오는 스트리 -> BufferedReader 보조스트림을 필요로 한다. 
		
		InputStreamReader isr= null;
		BufferedReader br=null;
		isr=new InputStreamReader(System.in);
		br=new BufferedReader(isr);
		//Scanner가 위과정을 구현하고 있다.
		String str="";
		
		try {
			str=br.readLine();
			System.out.println("str:"+str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
