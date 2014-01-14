public class InsertZ {

	public String canTransform(String init, String goal) {
		String newGoal = goal.replaceAll("z", "");
		if(init.compareTo(newGoal) == 0)
			return "Yes";
		else
			return "No";
	}

}
