package deadlines;

public class Run {
	
	public static void main(String args[]) {
		DeadlineManager dm = new DeadlineManager(new Date(16,1));
		dm.addTask(new Task("F27SB Lab 2", new Date(3,2)));		
		dm.addTask(new Task("F27SB Lab 1", new Date(23,1)));
		dm.addTask(new Task("F27SB Coursework 1", new Date(20,2)));
		dm.printTasks();
	}
	
/* Expected output (or something along these lines):
 
Task 1:
Name: F27SB Lab 1
Deadline: 23/1/2025 -- 7 days left!
-----
Task 2:
Name: F27SB Lab 2
Deadline: 3/2/2025 -- 18 days left!
-----
Task 3:
Name: F27SB Coursework 1
Deadline: 20/2/2025 -- 35 days left!
-----

*/
}