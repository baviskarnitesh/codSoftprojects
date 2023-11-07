package pack1;
/*  A comapany decided to give the bonus of  5% to emploee if his/her 
 * year of service is more than 5 years 
 * take a parameterized method which takes users salary and year of service and print 
 * the bonus amount and updated salary*/
public class Company {
	void employee(String EmpName,double salary,double ServiceYear) {
	     double Bonus = (salary*5)/100;
	     double TotalSalary=salary+Bonus;
	     if(ServiceYear>5) {
	     System.out.println(EmpName+" your Bonus is :"+Bonus);
	     System.out.println(EmpName+" your Total salary is :"+TotalSalary);
	     
	}else {
		System.out.println(EmpName+" you are not Eligible for bonus,you will eligible after completing 5 years of service");}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Company c=new Company();
          //c.employee("Nitesh", 25000, 5.6);
          c.employee("Nitesh", 25000, 4.2);
	}

}
