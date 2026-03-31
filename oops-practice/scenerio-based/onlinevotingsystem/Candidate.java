package com.oops.onlinevotingsystem;

public class Candidate {

    private int candidateId;
    private String candidateName;
    private int voteCount;

    public Candidate(int candidateId, String candidateName) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.voteCount = 0;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void addVote() {
        voteCount++;
    }
}
