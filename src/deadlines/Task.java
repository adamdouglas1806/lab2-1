package deadlines;

public class Task{
	
	private String name;
	private Date deadline;
	
public Task(String name, Date deadline) {
	this.name = name;
	this.deadline = deadline;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDay(String name) {
		this.name = name;
	}
	
	public Date getDeadline() {
		return deadline;
	}
	
	public void setDay(Date deadline) {
		this.deadline = deadline;
	}
	
}