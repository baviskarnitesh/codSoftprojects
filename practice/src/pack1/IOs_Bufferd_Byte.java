package pack1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class IOs_Bufferd_Byte {
	void operation1() throws Exception{
		
		System.out.println("reading data");
	//	
		BufferedInputStream bis1=new BufferedInputStream(new FileInputStream("D:\\ioprac\\shree _ram1.txt"));
		System.out.println("connection created");
		int x;
		while((x=bis1.read())!=-1) {
			System.out.print((char)x);
		}
		System.out.println();
		bis1.close();
		System.out.println("data retrieved");
	}
	void operation2()throws Exception {
		System.out.println("writing to add a new sentence");
    BufferedOutputStream bos1= new BufferedOutputStream(new FileOutputStream("D:\\ioprac\\shree _ram1.txt"));
    System.out.println("connection created");
    String sms=", this is true";
    byte arr[]=sms.getBytes();
    bos1.write(arr);
    bos1.close();
    
    }
	void operation3() throws Exception{
		System.out.println("for reading and writing the data ");
		
		BufferedInputStream bis1=new BufferedInputStream(new FileInputStream("D:\\ioprac\\shree _ram1.txt"));
		BufferedOutputStream bos1= new BufferedOutputStream(new FileOutputStream("D:\\ioprac\\shree _ram2.txt"));
		System.out.println("connection is created");
		int x;
		while((x=bis1.read())!=-1) {
			bos1.write(x);
		}
		System.out.println("data copied");
		bis1.close();
		bos1.close();
	}
	
void operation4() throws Exception{
		
		System.out.println("reading data using buffred Character Streams");
	//	
		BufferedReader br1 =new BufferedReader(new FileReader("D:\\ioprac\\swami1.txt"));
		System.out.println("connection created");
		int x;
		while((x=br1.read())!=-1) {
			System.out.print((char)x);
		}
		System.out.println();
		br1.close();
		System.out.println("data retrieved");
	}
void operation5() throws Exception
{
	System.out.println("=============================");
	System.out.println("READING THE DATA FROM A FILE");
	System.out.println("----------------------------------");
	BufferedWriter	bw=new BufferedWriter(new FileWriter("D:\\ioprac\\swami1.txt"));
	System.out.println("connection created");
	System.out.println("----------------------------------");
	
String msg=",avdhoot chinatan shree gurudev dutta";
bw.write(msg);

	
System.out.println();
System.out.println("data entered");
System.out.println("----------------------------------");
bw.close();
}

void operation6 () throws Exception
{
	
	System.out.println("copying the data from one file to another");
	BufferedReader br1 =new BufferedReader(new FileReader("D:\\ioprac\\swami1.txt"));
	
	BufferedWriter	bw=new BufferedWriter(new FileWriter("D:\\ioprac\\swami2.txt"));
	
	System.out.println("connection created");

	int x;
	while((x=br1.read())!=-1) {
		bw.write(x);
	}
	br1.close();
	bw.close();
	System.out.println("data copied");
	
}
	

	public static void main(String[] args) throws Exception {
		IOs_Bufferd_Byte  Ib1=new IOs_Bufferd_Byte ();
	//	Ib1.operation1();
		//Ib1.operation2();
		  Ib1.operation3();
		  Ib1.operation4();
		  Ib1.operation5();
		  Ib1.operation6();
	}

}
