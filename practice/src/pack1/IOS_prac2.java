package pack1;
import java.io.FileReader;
import java.io.FileWriter;

public class IOS_prac2 {
	
	void fileOperation1() throws Exception
	{
		System.out.println("READING THE DATA FROM A FILE");
		System.out.println("----------------------------------");
		FileReader fr=new FileReader("D:\\New folder\\iop_prac\\A3.txt");
		System.out.println("connection created");
		System.out.println("----------------------------------");
	int x;
	while((x=fr.read())!=-1) {
		System.out.print((char) x );//type casting char to int
		
	}System.out.println();
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
		FileWriter fw=new FileWriter("D:\\New folder\\iop_prac\\A3.txt",true);
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
		System.out.println("----------------------------------");
		System.out.println("copying the data from one file to another");
		System.out.println("----------------------------------");
		FileReader fr=new FileReader("D:\\New folder\\iop_prac\\A3.txt");
		FileWriter fw=new FileWriter("D:\\New folder\\iop_prac\\A4.txt");
		System.out.println("connection created");
		System.out.println("----------------------------------");
		int x;
		while((x=fr.read())!=-1) {
			fw.write(x);
		}
		fr.close();
		fw.close();
		System.out.println("data copied");
		System.out.println("----------------------------------");
	}
	public static void main(String[] args) throws Exception{
		IOS_prac2 I2=new IOS_prac2();
		//I2.fileOperation1();
		//I2.fileOperation2();
		I2.fileoperation3();
		
	}

}
