package number;

import java.io.*;

public class TestFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/linyufeng/Desktop/FileWriter.java");
			for (int i = 0; i < 50000; i++){
				fw.write(i);
			}
			
			fw.close();
			
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("wrong input");
			System.exit(-1);
		}
	}

}
