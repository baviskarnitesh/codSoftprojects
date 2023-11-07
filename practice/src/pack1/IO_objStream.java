package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class IO_objStream {

	
	void m1()throws Exception{
		System.out.println("performs serializtion");
		
		IO_obj1 o1=new IO_obj1 ();
		IO_obj2 o2=new IO_obj2 ();
		System.out.println(o1.a+" "+o1.b);
		System.out.println(o2.x+" "+o2.x);
		System.out.println("connection created");
		ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("D:\\ioprac\\j.txt"));
		ob.writeObject(o1);
		ob.writeObject(o2);
		System.out.println("serialztion completed");
		ob.close();
		
		System.out.println("-------------------------------");
		System.out.println("performing de-serializtion");
		
		ObjectInputStream obi=new ObjectInputStream(new FileInputStream("D:\\ioprac\\j.txt"));
		System.out.println("connection created");
		
		IO_obj1 ob1= (IO_obj1)obi.readObject();
		IO_obj2 ob2=(IO_obj2)obi.readObject();
		System.out.println(ob1.a+" "+ob1.b);
		System.out.println(ob2.x+" "+ob2.x);
		
		
		
		System.out.println("de-serialztion completed");
		obi.close();
	}
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		IO_objStream ibs=new IO_objStream ();
		ibs.m1();
	}

}
