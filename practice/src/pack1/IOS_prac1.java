package pack1;
import java.io.FileInputStream;
import  java.io.FileOutputStream;


public class IOS_prac1 {
	
	void fileOperation1()throws Exception
	{
		System.out.println("FOR READING A FILE");
		FileInputStream fis=new FileInputStream("D:\\New folder\\iop_prac\\A1.txt");
		System.out.println("connection created");
		int x;
		while((x=fis.read())!=-1) {
		//	System.out.println(x);
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("data retrieved");
		fis.close();
	}
	
	
	void fileOperation2()throws Exception
	{
		System.out.println("FOR writing A FILE");
	FileOutputStream fos=new FileOutputStream("D:\\New folder\\iop_prac\\A1.txt\\",true);
	System.out.println("connection created");
	String msg=",I LOVE MY JAVA";
	byte arr[]=msg.getBytes();
	fos.write(arr);
	//System.out.println();
	System.out.println("data entered");
	fos.close();
		
	}
	
	void fileOperation3()throws Exception
	{
		System.out.println("copying data from one file to another");
		
		FileInputStream fis=new FileInputStream("D:\\New folder\\iop_prac\\A1.txt\\");
		FileOutputStream fos=new FileOutputStream("D:\\New folder\\iop_prac\\A2.txt\\");
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
		IOS_prac1 io=new IOS_prac1();
	//	io.fileOperation1();
	//	io.fileOperation2();
		io.fileOperation3();
	}

}
