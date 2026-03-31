package stream_api;

import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;

class GymMember{
	
	private String name;
	private LocalDate expiryDate;
	
	public GymMember(String name,LocalDate expiryDate) {
		this.name=name;
		this.expiryDate=expiryDate;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	
	@Override
	public String toString() {
		return name+" | Expiry Date: "+expiryDate;
	}
}


public class MembershipExpiryCheck {

	public static void main(String[] args) {
		
		List<GymMember>memberList=new ArrayList<>();
		
		memberList.add(new GymMember("Rahul",LocalDate.now().plusDays(10)));
		memberList.add(new GymMember("Anita", LocalDate.now().plusDays(45)));
        memberList.add(new GymMember("Mohan", LocalDate.now().plusDays(25)));
        memberList.add(new GymMember("Sneha", LocalDate.now().plusDays(5)));
        
        LocalDate today=LocalDate.now();
        LocalDate next30Days=today.plusDays(30);
        
        List<GymMember> expiringSoonMembers =
                memberList.stream()
                        .filter(member ->
                                !member.getExpiryDate().isBefore(today) &&
                                !member.getExpiryDate().isAfter(next30Days)
                        )
                        .collect(Collectors.toList());

        System.out.println("Memberships expiring within 30 days:");
        expiringSoonMembers.forEach(System.out::println);
        		
        
	}

}
