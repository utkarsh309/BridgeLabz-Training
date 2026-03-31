package com.oops.onlinevotingsystem;

import java.util.ArrayList;

public class ElectionServiceImpl extends ElectionService {

    private ArrayList<Voter> voters = new ArrayList<>();
    private ArrayList<Candidate> candidates = new ArrayList<>();
    private ArrayList<Vote> votes = new ArrayList<>();

    @Override
    public void registerVoter(Voter voter) {
        voters.add(voter);
        System.out.println("Voter registered: " + voter.getVoterName());
    }

    @Override
    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
        System.out.println("Candidate added: " + candidate.getCandidateName());
    }

    @Override
    public void castVote(int voterId, int candidateId) throws DuplicateVoteException {

        Voter voter = findVoter(voterId);
        Candidate candidate = findCandidate(candidateId);

        if (voter == null || candidate == null) {
            System.out.println("Invalid voter or candidate.");
            return;
        }

        if (voter.hasVoted()) {
            throw new DuplicateVoteException("Voter " + voter.getVoterName() + " has already voted.");
        }

        Vote vote = new Vote(voter, candidate);
        votes.add(vote);

        candidate.addVote();
        voter.markVoted();

        System.out.println("Vote casted by " + voter.getVoterName() + " for " + candidate.getCandidateName());
    }

    @Override
    public void declareResult() {

        System.out.println("Election Results:");
        for (int i = 0; i < candidates.size(); i++) {
            Candidate candidate = candidates.get(i);
            System.out.println(candidate.getCandidateName() + "  Votes: " + candidate.getVoteCount());
        }
    }

    private Voter findVoter(int voterId) {
        for (int i = 0; i < voters.size(); i++) {
            if (voters.get(i).getVoterId() == voterId) {
                return voters.get(i);
            }
        }
        return null;
    }

    private Candidate findCandidate(int candidateId) {
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getCandidateId() == candidateId) {
                return candidates.get(i);
            }
        }
        return null;
    }
}
