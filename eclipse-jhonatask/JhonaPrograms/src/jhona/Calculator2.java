package jhona;

public class Calculator2 {
	static int num1=3;
	static int num2=4;
	static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(int num1,int num2) {
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) {
		System.out.println(powerInt(num1,num2));
		//System.out.println(powerDouble(num1,num2));
	}
	
}
