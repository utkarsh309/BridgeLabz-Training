package scenario.streambuzz;

public class CreatorStats {

	private String creatorName;
	private int[] weeklyLikes;
	
	public CreatorStats(String creatorName,int[]weeklyLikes) {
		
		this.creatorName=creatorName;
		this.weeklyLikes=weeklyLikes;
	}
	
	public String getCreatorName() {
		return creatorName;
	}
	
	public int[] getWeeklyLikes() {
		return weeklyLikes;
	}
}
