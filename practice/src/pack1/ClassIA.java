package pack1;

public class ClassIA extends B implements InterfaceA,InterfaceB
{
	@Override
public 	void m1() {
		System.out.println("Interafce A abstract meth1 overriden");
	}
	@Override
	public void show(String data) {
		//System.out.println("Interafce B abstract meth show overriden");
		System.out.println(data);
	}
public	void m2()  {
		System.out.println("Interafce A abstract meth2 overriden");
	}
public void m3() {
	System.out.println( "Interafce A abstract static  meth3 overriden");
}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ClassIA ai=new ClassIA();
     InterfaceB boj=new ClassIA();
       ai.m1();
       System.out.println("-----------------------------------");
       ai.m2();
       System.out.println("-----------------------------------");
       ai.m3();
       System.out.println("-----------------------------------");
      // ai.m4();
       ai.show("neha");
       boj.show("loves");
       ai.show("nitesh");
	}

}
