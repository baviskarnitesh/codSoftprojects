package pack1;
/*  A school has following  rules for grading system
 * a. below 25- F 
 * b. 25 to below 45 - E
 * c.45 to below 50 - D
 * d.50 to below 60 - C
 * e.60 to below 70 - B
 * f. above 80 - A
 * take a parameterized method which takes marks as input and print the 
 * corresponding grade
 * -----------------------------------------------------------
 *  */

public class School1 {
	public void Grading(String SName,int marks) {
 	   if(marks<25) {
 		  System.out.println(SName+":your Grade 'F'");
 	   }
 		   if (marks>=25 && marks<=45) {
 			   System.out.println(SName+":your Grade is 'E'");
 		   }else if(marks>=45 && marks<=50) {
 			   System.out.println(SName+":your Grade is 'D'");
 		   }
 		   if(marks>=50 && marks<=60) {
 			   System.out.println(SName+":your Grade is 'C'");
 	   } else if (marks>=60 && marks<=70) {
 		   System.out.println(SName+":your Grade is 'B'");
 	   }
 	   if(marks>80) {
 		   System.out.println(SName+":your Grade is 'A'");
 	   }
 		    
 	   }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        School1 s=new School1();
        s.Grading("Raj",22);
        s.Grading("Aman",37);
        s.Grading("Jay",48);
        s.Grading("Ajay",59);
        s.Grading("sachin",65);
        s.Grading("om",77);
        s.Grading("Nitesh",92);
	}

}
