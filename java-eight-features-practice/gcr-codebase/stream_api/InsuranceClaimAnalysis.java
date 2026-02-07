package stream_api;

import java.util.*;
import java.util.stream.Collectors;


class InsuranceClaim {

    private String claimType;
    private double claimAmount;

    public InsuranceClaim(String claimType, double claimAmount) {
        this.claimType = claimType;
        this.claimAmount = claimAmount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }
}

public class InsuranceClaimAnalysis {

	public static void main(String[] args) {
		
		List<InsuranceClaim>claimList=new ArrayList<>();
		claimList.add(new InsuranceClaim("Health",50000));
		claimList.add(new InsuranceClaim("Health", 70000));
        claimList.add(new InsuranceClaim("Vehicle", 30000));
        claimList.add(new InsuranceClaim("Vehicle", 40000));
        claimList.add(new InsuranceClaim("Property", 90000));
        
        
        Map<String,Double>averageClaimAmount=claimList.stream()
        	.collect(Collectors.groupingBy(claim ->claim.getClaimType(),
        			Collectors.averagingDouble(claim ->claim.getClaimAmount())
        			
        			));
        
        averageClaimAmount.forEach((type,amount)-> 
        	System.out.println(type+" Average Claim:"+amount));
	}

}
