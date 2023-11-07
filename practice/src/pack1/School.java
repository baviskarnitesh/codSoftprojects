package pack1;
/*  a student will not be allowed  to  sit  in exam if his/her 
    attendance is less than 75%
    take a parameterized  method  which take 
==> number of  classes
==> number of classes attended & print  percentage  of class attended 
    is student is allowed to sit in exam or not.*/


    public class School {
    	 void student ( String Name, double  totalClasses,double attendedClasses) {
    		double attendence=(attendedClasses/totalClasses)*100;
    	System.out.println(Name +" your attendence is : "+attendence+"%");
    	
    
    	if (attendence<75) {
    		System.out.println(Name +" you are not eligible to attend exam");
    	}
    	
    	else {
    		System.out.println("Congrates dear!!!"+Name+" you are eligible to attend exam");
    	}
    	
    	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s= new School();
		//s.student("Nitesh",200, 190);
		s.student("Nitesh",200, 110);
       
	}

}
