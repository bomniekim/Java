
public class Work extends Student {

	private String task;
	
	public Work() {
		// TODO Auto-generated constructor stub
	}
	
	public Work(String name, int age, String major, String task) {
		super(name, age, major);
		this.task=task;
	}
	
	public void show() {
		super.show();
		System.out.println("task: "+task);
	}

}
