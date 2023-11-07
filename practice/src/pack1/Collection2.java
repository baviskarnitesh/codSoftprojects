package pack1;

public class Collection2 {
	
		String emp_name;
		int emp_id;
		String emp_dept;
     public Collection2(String emp_name ,int emp_id,String emp_dept) {
    	 this.emp_name=emp_name;
    	 this.emp_id=emp_id;
    	 this.emp_dept=emp_dept;
     }
     @Override
     public String toString() {
    	 return emp_name+" "+emp_id+" "+emp_dept;
     }
     

	

}
