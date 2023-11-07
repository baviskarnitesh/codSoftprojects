package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ios_byte_test {
	
	
	void fileOperation3()throws Exception
	{
		System.out.println("copying data from one file to another");
		
		FileInputStream fis=new FileInputStream("D:\\ioprac\\bappa1.jpg");
		FileOutputStream fos=new FileOutputStream("D:\\ioprac\\bappa3.jpg");
	System.out.println("connection created");
	int x;
	while((x=fis.read())!=-1) {
		fos.write(x);
	}
	System.out.println("data copied");
	fis.close();
	fos.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Ios_byte_test io1=new Ios_byte_test();
		io1.fileOperation3();
	}
}
