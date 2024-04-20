package jhona;

public class Book4 {
	private String Bname,author;
	private double price;
	int Qntystock;
	public Book4() {}
	public String getName() {
		return Bname;
	}
	public void setName(String name) {
		this.Bname = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQntystock() {
		return Qntystock;
	}
	public void setQntystock(int qntystock) {
		Qntystock = qntystock;
	}
	
}
