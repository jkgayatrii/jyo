package jhona;
public class Author4{
	String name;
	 String mail;
     char gender;
	public void Author4(String name,String mail,char gender) {
		this.name=name;
		this.mail=mail;
		this.gender=gender;
	}
	
	public static void main(String[] args) {
		Book4 details=new Book4();
		details.setPrice(19.99);
		details.setName("sample");
		details.setQntystock(100);
		Author4 author=new Author4();
		author.Author4("john deo","jyo@gmail.com",'F');
		System.out.println("Book details"+"\n"+"name:"+details.getName()+"\n"+"author:"+author.name+"\n"+"mail.id:"+author.mail+"\n"+"gender:"+author.gender+"\n"+"price:$"+details.getPrice()+"\n"+"quntity:"+details.Qntystock);
		
			
	}
}
