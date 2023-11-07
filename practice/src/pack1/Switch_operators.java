package pack1;

public class Switch_operators {
	void m1(int a, int b, char operator) {
		switch(operator)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(b-a);
			break;
		case'*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(b/a);
			break;
			default:
				System.out.println("invalid character errrrrrrrrrrrrooooooooooorrrrrrr______");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch_operators s = new Switch_operators();
		s.m1(10, 20, '&');
	}

}
