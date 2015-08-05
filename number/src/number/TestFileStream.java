package number;

import java.io.*;

public class TestFileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int b = 0;
		
		//节点流--字符流
		FileReader in = null;
		FileWriter out = null;
		try { //也可以直接在之前 new 一个 reader / writer
			in = new FileReader("/Users/linyufeng/Documents/workspace/number/src/number/TestFileStream.java");
			out = new FileWriter("/Users/linyufeng/Desktop/TestFileOutputStream.java");
		} catch (FileNotFoundException e) {
			System.out.println("Not Found File");
			System.exit(-1);
		}
		
		//缓冲流
		BufferedReader br= new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		br.mark(1000);//从第100个字符开始输入程序
//		br.reset();//回到第100个字符
		
		String s;
		
		//将 int b 的值填充成in 文本里面的字符--之后写入 out 文本里面时要注意类型转换
		try 
		{
			long num;	
			for (num = 0; (b = br.read()) != -1; num++) 
			{
				System.out.print((char)b);
				bw.write(b);
			}
			
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		
		bw.flush();
		in.close(); //用完了一定要关闭管道！！
		out.close();
		bw.close();
		br.close();
		
		System.out.println();
		System.out.println("in total read " + num + " bytes");
		} catch (IOException e1) {
			System.out.println("file read error");
			System.exit(-1);
		}
	}

}
