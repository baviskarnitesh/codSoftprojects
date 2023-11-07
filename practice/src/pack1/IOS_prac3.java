package pack1; 
import java.io.FileReader;
import java.io.FileWriter;

public class IOS_prac3 {
	
	void fileOperation1() throws Exception
	{
		System.out.println("READING THE DATA FROM A FILE");
		System.out.println("----------------------------------");
		FileReader fr=new FileReader("D:\\New folder\\iop_prac\\pexels-lil-artsy-1425353.jpg");
		System.out.println("connection created");
		System.out.println("----------------------------------");
	int x;
	while((x=fr.read())!=-1) {
		System.out.print((char) x );//type casting char to int
		
	}
	System.out.println();
	System.out.println("----------------------------------");
	System.out.println("data retrieved");
	System.out.println("----------------------------------");
	fr.close();
	
	}
	void fileOperation2() throws Exception
	{
		System.out.println("=============================");
		System.out.println("READING THE DATA FROM A FILE");
		System.out.println("----------------------------------");
		FileWriter fw=new FileWriter("D:\\New folder\\iop_prac\\pexels-lil-artsy-1425353.jpg");
		System.out.println("connection created");
		System.out.println("----------------------------------");
		
	String msg=",along with character streams ";
	fw.write(msg);

		
	System.out.println();
	System.out.println("data entered");
	System.out.println("----------------------------------");
	fw.close();
	}
	
	void fileoperation3 () throws Exception
	{
		
		System.out.println("copying the data from one file to another");
		
		FileReader fr1=new FileReader("D:\\ioprac\\bappa1.jpg");
		FileWriter fw1=new FileWriter("D:\\ioprac\\bappa3.jpg");
		System.out.println("connection created");
	
		int x;
		while((x=fr1.read())!=-1) {
			fw1.write(x);
		}
		fr1.close();
		fw1.close();
		System.out.println("data copied");
		
	}
	public static void main(String[] args) throws Exception{
		IOS_prac3 I3=new IOS_prac3();
		//I2.fileOperation1();
		//I2.fileOperation2();
		I3.fileoperation3();
		
	}

}

