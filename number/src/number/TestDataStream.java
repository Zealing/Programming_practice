package number;

import java.io.*;

public class TestDataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteArrayOutputStream baos = new ByteArrayOutputStream();//新建一个字节数组
		DataOutputStream dos = new DataOutputStream(baos);//套结上一个数据流输出--可以直接输出基本类型到文本里
		
		try {
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray()); //新建一个字节数组输入流--必须要是 byte[]
			System.out.println(bais.available()); //输出能有多少个字符能被输出
			DataInputStream dis = new DataInputStream (bais);
			
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			
			dos.close();//关闭最外面的流就可以把全部都关闭了
			dis.close();
		} catch (IOException e) {
			e.getStackTrace();
			System.exit(-1);
		}
	}

}
