package lab3;

import java.util.Comparator;

public class TaskPriorityComparator implements Comparator<Task> {

	@Override
	public int compare(Task o1, Task o2) {
		return Integer.valueOf(o2.getPriority()).compareTo(o1.getPriority());
	}

}