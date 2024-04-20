package jhona;

public class Ques1 {
	int w,h,d;
	 Ques1(int w,int h,int d){
		this.w=w;
		this.h=h;
		 this.d=d;
		
		
	}
	public int vol(int a,int b,int c) {
		return a*b*c;
	}
	public static void main(String[] args) {
		System.out.println(new Ques1(2,3,4).vol(2, 3, 4));
		
	}
}
