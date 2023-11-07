package pack1;

public class Switch_case1 {
	void meth1(String day) 
	{
		System.out.println("IMPLEMENT SWITCH_CASE");
      int a=200;
      int b=57;
      final int x=10;
      int age=35;
      switch(a-135-b) {
      //System.out.println("hello");
      case x:
    	  System.out.println("case 10 executed");
    	  switch(day)
    	  {
    	  case "wednesday":
    		  System.out.println("today we are dealing with switch");
    		  break;
    	  case "thursday":
    	  System.out.println("we will use switch in programs");
    	  break;
    	  }
    	  break;
      case 200:
    	  System.out.println("case 200 will be executed ");
    	  break;
      case 'A':
    	  System.out.println(" int and char both are comapitable type data type");
    	  break;
      case 40/5:
    	  System.out.println("case 40 executed");
    	  if(age>18) 
    	  {
    		  System.out.println("you are eligible to vote");
    	  }else 
    	  {
    		  System.out.println("you are  not eligible to vote "); 
    	  }
    		break;  
    		default:
    			System.out.println(" default case got executed");
    			break;
    	  }System.out.println("compiler came out from switch case");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Switch_case1().meth1("wednesday"); 
	}

}
