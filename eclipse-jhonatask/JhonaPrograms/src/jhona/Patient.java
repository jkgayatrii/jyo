package jhona;


public class Patient {
	String name;
	double height;
	int weight;
	void patientdetails(String name,double height,int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
		void calculate() {
			System.out.printf("%.2f",weight/(height*height));
			
		}
	
	public static void main(String[] args) {
		Patient p1=new Patient();
		p1.patientdetails("john", 1.75, 70);
		p1.calculate();
	}
	
}
