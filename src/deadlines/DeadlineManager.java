package deadlines;

import java.util.ArrayList;

public class DeadlineManager{
	
	Date date;
	ArrayList<Task> listOfTasks;
	
	public DeadlineManager(Date d) {
		this.date = d;
		listOfTasks = new ArrayList<Task>();
	}
	
	public void addTask(Task t) {
		listOfTasks.add(t);
	}
	
	public void printTasks() {
		for (int i = 0; i<=listOfTasks.size()-1; i++) {
			System.out.println("Task " + (i+1));
			System.out.println("Name:" + listOfTasks.get(i).getName());
			System.out.println("Deadline: " + listOfTasks.get(i).getDeadline().ToString() + " -- " + listOfTasks.get(i).getDeadline().daysUntil(date) + " days left!");
		}
		
	}
	
}