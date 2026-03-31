package scenario.streambuzz;

import java.util.*;

public class Program {

	public static List<CreatorStats> engagementBoard=new ArrayList<>();
	
	public void registerCreator(CreatorStats record) {
		
		engagementBoard.add(record);
		
	}
	
	public Map<String,Integer> getTopPostCounts(List<CreatorStats> records,int threshold){
		
		Map<String,Integer> result=new HashMap<>();
		
		for(CreatorStats creator:records) {
			
			int count=0;
			
			for(int likes:creator.getWeeklyLikes()) {
				
				if(likes>threshold) {
					count++;
				}
			}
			
			if(count>0) {
				result.put(creator.getCreatorName(), count);
			}
		}
		
		return result;
		
	}
	
	public double calculateAverageLikes() {
		
		int totalLikes=0;
		int totalWeeks=0;
		
		for(CreatorStats creator:engagementBoard) {
			
			for(int like:creator.getWeeklyLikes()) {
				
				totalLikes+=like;
				totalWeeks++;
			}
		}
		return totalLikes/totalWeeks;
	}
	
    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Program program = new Program();
        boolean running = true;

        while (running) {

            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("Enter Creator Name:");
                    String name = scanner.nextLine();

                    int[] likes = new int[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");
                    for (int i = 0; i < 4; i++) {
                        likes[i] = scanner.nextInt();
                    }

                    CreatorStats creator = new CreatorStats(name, likes);
                    program.registerCreator(creator);
                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    System.out.println("Enter like threshold:");
                    int threshold = scanner.nextInt();

                    Map<String, Integer> result =program.getTopPostCounts(engagementBoard, threshold);

                    if (result.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        for (Map.Entry<String, Integer> entry : result.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    double average = program.calculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + (int) average);
                    break;

                case 4:
                    System.out.println("Logging off ");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}