package pack1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class IOS_DataStream {
	void data_operation1() throws Exception 
	{
		System.out.println("implemeting data streams");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\ioprac\\A1.txt"));
		System.out.println("connection created");
		
		dos.writeInt(1000);
		dos.writeChar('a');
		dos.writeBoolean(true);
	dos.writeInt(2000);		System.out.println("data entered"+"\n");
		//dos.close();
System.out.println("----------------------------------------");
System.out.println();
	
    DataInputStream dis=new DataInputStream(new FileInputStream("D:\\ioprac\\A1.txt"));
System.out.println("connection created");
 System.out.println(dis.readInt());
 System.out.println(dis.readChar());
 System.out.println(dis.readBoolean());
 System.out.println(dis.readInt());
System.out.println("data retrieved");
dis.close();
	
	}
	
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		IOS_DataStream id=new IOS_DataStream();
		id.data_operation1();
	}

}
