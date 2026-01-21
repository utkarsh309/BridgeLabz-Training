package generics.resumescreener;

public abstract class JobRole {

    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    // Each role defines how it is evaluated
    public abstract String getRoleType();
}
