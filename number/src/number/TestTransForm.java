package number;

import java.io.*;

public class TestTransForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		try {
			s = br.readLine();
			while (s != null) { //程序等待输入--阻塞方法或同步方法
				if (s.equalsIgnoreCase("exit")) {
					break;
				} else {
					System.out.println(s.toUpperCase());
					s = br.readLine();
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}

	}

}
