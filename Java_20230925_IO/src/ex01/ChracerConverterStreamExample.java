package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ChracerConverterStreamExample {

	public static void main(String[] args) throws IOException {
		String str = "지유찬, 수영 남자 자유형 50m 아시안게임 신기록 '쾌거'…판잔러 제치고 예선 1위 [항저우 라이브]";	
		write(str);
		String data = read();
		System.out.println(data);
	}

	
	static void write(String str) throws IOException{
		OutputStream os = new FileOutputStream("c:/data/test2.txt");
		
		Writer writer = new OutputStreamWriter(os, "utf-8");
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	static String read() throws IOException{
		InputStream is = new FileInputStream("c:/data/test2.txt");
		Reader reader = new InputStreamReader(is, "utf-8");
		
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String(data, 0, num);
		
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
