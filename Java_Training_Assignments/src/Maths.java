
public class Maths {
	
	public void add(int a, int b) {
		int result = a+b;
		System.out.printf("The addition of %d and %d is %d\n",a,b,result);
	}
	
	public void substraction(int a, int b) {
		int result = a-b;
		System.out.printf("The substraction of %d and %d is %d\n",a,b,result);
	}
	
	public void multiplication(int a,int b) {
		int result = a*b;
		System.out.printf("The multiplication of %d and %d is %d\n",a,b,result);
	}
	
	public void division(int a,int b) {
		float result = a/b;
		System.out.printf("The division of %d and %d is %.2f\n",a,b,result);
	}
	
	public void square(int a) {
		int result = a*a;
		System.out.printf("The square of %d is %d\n",a,result);
	}
	
	public void cube(int a) {
		int result = a*a*a;
		System.out.printf("The cube of %d is %d\n",a,result);
		
	}

}
