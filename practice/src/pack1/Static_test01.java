package pack1;
//for static & instance var
public class Static_test01 {
	static int x;//x=0
	int y;//y=0
	Static_test01(){
		System.out.println("instance :"+ ++y);
		System.out.println("static :"+ ++x+"\n");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_test01 t1=new Static_test01();
		//instance:1
		//static :1
		Static_test01 t2=new Static_test01();
		
		//instance:1
		//static:2
		
		Static_test01 t3=new Static_test01();
		//instance:1
		//static:3
    // for every instance a seprate copy of memory is generated but 
		//for static variable only one copy of memory is generated ,
		//this is the reaso9n why the value of static is increasing by each 
		// object declartion.
	}

}
