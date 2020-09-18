package week13.set;

import java.util.Comparator;

public class ComparatorByGoalAsc implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.getGoal()==arg1.getGoal()?
				arg0.getName().compareTo(arg1.getName())
				:arg0.getGoal()-arg1.getGoal();
	}

}
