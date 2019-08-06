
public class Professor extends Normal {
	
	private String subject="";
	
	public Professor() {
		
	}

	public Professor(String name, int age, String subject) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.subject=subject;
	}
	
	public void show() {
		super.show();
		System.out.println("subject: "+subject);
	}

	
}
