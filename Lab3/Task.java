package lab3;

public class Task {
	private int length;
	private long creationTime;
	private int priority;

	public Task(int length, int priority) {
		this.length = length;
		creationTime = System.currentTimeMillis();
		this.priority = priority;
	}

	public int getLength() {
		return length;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public long getCreationTime() {
		return creationTime;
	}

	public String toString() {
		return length + " " + priority + "\n";
	}
}