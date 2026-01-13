package com.oops.onlinevotingsystem;

public class OnlineVotingApp {

    public static void main(String[] args) {

        ElectionService service = new ElectionServiceImpl();

        // Register voters
        service.registerVoter(new Voter(1, "Utkarsh"));
        service.registerVoter(new Voter(2, "Aman"));

        // Add candidates
        service.addCandidate(new Candidate(101, "Candidate A"));
        service.addCandidate(new Candidate(102, "Candidate B"));

        try {
            // Cast votes
            service.castVote(1, 101);
            service.castVote(2, 102);

            // Duplicate vote 
            service.castVote(1, 102);

        } catch (DuplicateVoteException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        // Declare result
        service.declareResult();
    }
}

